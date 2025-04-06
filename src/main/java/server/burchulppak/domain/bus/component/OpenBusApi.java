package server.burchulppak.domain.bus.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import server.burchulppak.domain.bus.BusClient;
import server.burchulppak.domain.bus.vo.BusRealTimeRequest;
import server.burchulppak.domain.bus.vo.BusRouteInfo;
import server.burchulppak.domain.bus.vo.BusViaStationRequest;

import java.util.List;

@Component
@RequiredArgsConstructor
public class OpenBusApi {

    private final BusClient busClient;

    public List<BusRouteInfo> getOpenAPiBusRouteInfo(String startRow) {
        return busClient.getOpenAPiBusRouteInfo(startRow);
    }

    public List<BusRealTimeRequest> getOpenAPiBusRealTime(String busStationId) {
        return busClient.getOpenAPiBusRealTime(busStationId);
    }

    public BusViaStationRequest getOpenAPiBusViaStation(String busRouteId) {
        return busClient.getOpenAPiBusViaStation(busRouteId);
    }
}
