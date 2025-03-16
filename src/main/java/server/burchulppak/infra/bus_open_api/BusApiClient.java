package server.burchulppak.infra.bus_open_api;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import server.burchulppak.domain.bus.BusClient;
import server.burchulppak.domain.bus.vo.BusRouteInfo;
import server.burchulppak.infra.bus_open_api.open_api.client.OpenApiBusRealTimeFeignClient;
import server.burchulppak.infra.bus_open_api.open_api.client.OpenApiBusRouteFeignClient;
import server.burchulppak.infra.bus_open_api.open_api.dto.OpenApiResponse;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRealTimeOpenApiRequest;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRouteRequest;
import server.burchulppak.infra.bus_open_api.t_data_open_api.client.OpenApiTDataBusRouteFeignClient;
import server.burchulppak.infra.bus_open_api.t_data_open_api.vo.BusRouteInfoRequest;

import java.util.List;

@RequiredArgsConstructor
@Component
@Slf4j
public class BusApiClient implements BusClient {

    private final OpenApiBusRouteFeignClient openApiBusRouteFeignClient;
    private final OpenApiTDataBusRouteFeignClient openApiTDataBusRouteFeignClient;
    private final OpenApiBusRealTimeFeignClient openApiBusRealTimeFeignClient;

    @Override
    public List<BusRouteRequest> getOpenAPiBusRoute(String cityCode, String routeNo) {
        OpenApiResponse<BusRouteRequest> openAPiBusRoute = openApiBusRouteFeignClient.getOpenAPiBusRoute("1","100",cityCode, routeNo);
        return openAPiBusRoute.getItem();
    }

    @Override
    public List<BusRouteInfo> getOpenAPiBusRouteInfo(String startRow) {
        List<BusRouteInfoRequest> openAPiBusRoute = openApiTDataBusRouteFeignClient.getOpenAPiBusRoute(startRow, "100000");
        return openAPiBusRoute.stream().map(
                BusRouteInfoRequest::to).toList();
    }

    @Override
    public List<BusRealTimeOpenApiRequest> getOpenAPiBusRealTime(String busStationId) {
        return openApiBusRealTimeFeignClient.getBusRealTime(busStationId).getBody().getItemList();
    }

}
