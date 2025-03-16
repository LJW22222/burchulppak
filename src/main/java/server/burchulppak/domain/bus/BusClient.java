package server.burchulppak.domain.bus;

import server.burchulppak.domain.bus.vo.BusRouteInfo;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRealTimeOpenApiRequest;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRouteRequest;

import java.util.List;

public interface BusClient {

    List<BusRouteRequest> getOpenAPiBusRoute(String cityCode, String routeNo);

    List<BusRouteInfo> getOpenAPiBusRouteInfo(String startRow);

    List<BusRealTimeOpenApiRequest> getOpenAPiBusRealTime(String busStationId);

}
