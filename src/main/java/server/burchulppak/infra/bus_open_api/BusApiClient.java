package server.burchulppak.infra.bus_open_api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import server.burchulppak.common.exception.InfraException;
import server.burchulppak.domain.bus.BusClient;
import server.burchulppak.domain.bus.vo.BusStationInfoRequest;
import server.burchulppak.domain.bus.vo.BusViaStationRequest;
import server.burchulppak.infra.exception.BusErrorCode;
import server.burchulppak.domain.bus.vo.BusRealTimeRequest;
import server.burchulppak.domain.bus.vo.BusRouteInfo;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.client.OpenApiBusRealTimeFeignClient;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.client.OpenApiBusViaStationFeignClient;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.vo.BusRealTimeOpenApiRequest;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.vo.BusViaStationsOpenApiRequest;
import server.burchulppak.infra.bus_open_api.t_data_open_api.client.OpenApiTDataBusRouteFeignClient;
import server.burchulppak.infra.bus_open_api.t_data_open_api.vo.BusRouteInfoRequest;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Component
@Slf4j
public class BusApiClient implements BusClient {

    private final OpenApiTDataBusRouteFeignClient openApiTDataBusRouteFeignClient;
    private final OpenApiBusRealTimeFeignClient openApiBusRealTimeFeignClient;
    private final OpenApiBusViaStationFeignClient openApiBusViaStationFeignClient;


    @Override
    public List<BusRouteInfo> getOpenAPiBusRouteInfo(String startRow) {
        List<BusRouteInfoRequest> openAPiBusRoute = openApiTDataBusRouteFeignClient.getOpenAPiBusRoute(startRow, "100000");
        return openAPiBusRoute.stream().map(
                BusRouteInfoRequest::to).toList();
    }

    @Override
    public List<BusRealTimeRequest> getOpenAPiBusRealTime(String busStationId) {
        return Optional.ofNullable(openApiBusRealTimeFeignClient.getBusRealTime(busStationId).getBody().getItemList())
                .filter(list -> !list.isEmpty())
                .orElseThrow(() -> new InfraException(BusErrorCode.NOT_FOUNT_BUS_INFO))
                .stream()
                .map(BusRealTimeOpenApiRequest::to)
                .toList();
    }

    @Override
    public BusViaStationRequest getOpenAPiBusViaStation(String busRouteId) {
        List<BusViaStationsOpenApiRequest> itemList = openApiBusViaStationFeignClient.getBusViaStations(busRouteId).getBody().getItemList();
        List<BusStationInfoRequest> busStationInfoRequestList = Optional.ofNullable(itemList)
                .filter(list -> !list.isEmpty())
                .orElseThrow(() -> new InfraException(BusErrorCode.NOT_FOUNT_BUS_INFO))
                .stream()
                .map(BusViaStationsOpenApiRequest::to)
                .toList();


        return new BusViaStationRequest(itemList.get(0).getBusRouteNm(), itemList.get(0).getBusRouteId(), busStationInfoRequestList);
    }

}
