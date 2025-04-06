package server.burchulppak.application.bus;

import server.burchulppak.domain.bus.vo.BusRealTimeRequest;
import server.burchulppak.domain.bus.vo.BusStation;
import server.burchulppak.domain.bus.vo.BusViaStationRequest;

import java.util.List;

public interface BusServiceUseCase {
    List<BusRealTimeRequest> getOpenAPiBusRealTime(String busStationId);

    List<BusStation> getOpenAPiBusStationList(String busStationName);

    BusViaStationRequest getOpenAPiBusViaStation(String busRouteId);

}
