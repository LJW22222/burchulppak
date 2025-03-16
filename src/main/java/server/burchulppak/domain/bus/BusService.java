package server.burchulppak.domain.bus;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import server.burchulppak.domain.bus.component.BusSelect;
import server.burchulppak.domain.bus.component.OpenBusApi;
import server.burchulppak.domain.bus.vo.BusRealTimeRequest;
import server.burchulppak.domain.bus.vo.BusStation;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BusService implements BusServiceUseCase{

    private final OpenBusApi openBusApi;
    private final BusSelect busSelect;


    @Override
    public List<BusRealTimeRequest> getOpenAPiBusRealTime(String busStationId) {
        return openBusApi.getOpenAPiBusRealTime(busStationId);
    }

    @Override
    public List<BusStation> getOpenAPiBusStationList(String busStationName) {
        return busSelect.selectBusStationList(busStationName).stream().map(BusStation::of).toList();
    }


}
