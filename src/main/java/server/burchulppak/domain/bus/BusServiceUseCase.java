package server.burchulppak.domain.bus;

import server.burchulppak.domain.bus.vo.BusRealTimeRequest;
import server.burchulppak.domain.bus.vo.BusStation;

import java.util.List;

public interface BusServiceUseCase {
    List<BusRealTimeRequest> getOpenAPiBusRealTime(String busStationId);

    List<BusStation> getOpenAPiBusStationList(String busStationName);


}
