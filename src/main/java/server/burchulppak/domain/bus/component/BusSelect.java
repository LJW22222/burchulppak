package server.burchulppak.domain.bus.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import server.burchulppak.domain.bus.entity.BusRoute;
import server.burchulppak.domain.bus.repository.BusRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BusSelect {

    private final BusRepository busRepository;

    public List<BusRoute> selectBusStationList(String busStationName) {
        return busRepository.getBusStationList(busStationName);
    }

    public long selectBusStationCount() {
        return busRepository.count();
    }


}
