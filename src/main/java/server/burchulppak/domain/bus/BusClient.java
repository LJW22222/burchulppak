package server.burchulppak.domain.bus;

import server.burchulppak.domain.bus.vo.BusRealTimeRequest;
import server.burchulppak.domain.bus.vo.BusRouteInfo;
import server.burchulppak.domain.bus.vo.BusViaStationRequest;

import java.util.List;

public interface BusClient {

    List<BusRouteInfo> getOpenAPiBusRouteInfo(String startRow);

    List<BusRealTimeRequest> getOpenAPiBusRealTime(String busStationId);

    BusViaStationRequest getOpenAPiBusViaStation(String busRouteId);

}
