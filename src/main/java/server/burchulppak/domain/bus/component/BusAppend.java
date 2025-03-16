package server.burchulppak.domain.bus.component;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import server.burchulppak.domain.bus.entity.BusRoute;
import server.burchulppak.domain.bus.repository.BusRepository;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BusAppend {

    private final BusRepository busRepository;

    public void saveAll(List<BusRoute> busRoute) {
        busRepository.saveAll(busRoute);
    }

}
