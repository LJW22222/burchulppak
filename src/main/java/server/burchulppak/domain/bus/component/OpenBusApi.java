package server.burchulppak.domain.bus.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import server.burchulppak.domain.bus.BusClient;
import server.burchulppak.domain.bus.vo.BusRealTimeRequest;
import server.burchulppak.domain.bus.vo.BusRouteInfo;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRealTimeOpenApiRequest;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRouteRequest;

import java.util.List;

@Component
@RequiredArgsConstructor
public class OpenBusApi {

    private final BusClient busClient;

    public List<BusRouteRequest> getOpenAPiBusRoute(String cityCode, String routeNo) {
        return busClient.getOpenAPiBusRoute(cityCode, routeNo);
    }

    public List<BusRouteInfo> getOpenAPiBusRouteInfo(String startRow) {
        return busClient.getOpenAPiBusRouteInfo(startRow);
    }

    public List<BusRealTimeRequest> getOpenAPiBusRealTime(String busStationId) {
        return busClient.getOpenAPiBusRealTime(busStationId).stream().map(BusRealTimeOpenApiRequest::to).toList();
    }

}
