package server.burchulppak.domain.bus.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import server.burchulppak.common.exception.DomainException;
import server.burchulppak.domain.bus.entity.BusRoute;
import server.burchulppak.domain.bus.repository.BusRepository;

import java.util.List;
import java.util.Optional;

import static server.burchulppak.infra.exception.BusErrorCode.NOT_FOUNT_BUS_STATION_INFO;

@Component
@RequiredArgsConstructor
public class BusSelect {

    private final BusRepository busRepository;

    public List<BusRoute> selectBusStationList(String busStationName) {
        return  Optional.ofNullable(busRepository.getBusStationList(busStationName))
                .filter(list -> !list.isEmpty())
                .orElseThrow(() -> new DomainException(NOT_FOUNT_BUS_STATION_INFO))
                .stream()
                .toList();
    }

    public long selectBusStationCount() {
        return busRepository.count();
    }


}
