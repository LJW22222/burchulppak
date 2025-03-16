package server.burchulppak.common.schedule;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import server.burchulppak.domain.bus.component.BusAppend;
import server.burchulppak.domain.bus.component.BusSelect;
import server.burchulppak.domain.bus.component.OpenBusApi;
import server.burchulppak.domain.bus.entity.BusRoute;
import server.burchulppak.domain.bus.mapper.BusRouteMapper;
import server.burchulppak.domain.bus.vo.BusRouteInfo;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class Init {

    private final OpenBusApi openBusApi;
    private final BusAppend busAppend;
    private final BusSelect busSelect;

    @PostConstruct
    public void init() {
        List<BusRouteInfo> result = openBusApi.getOpenAPiBusRouteInfo(String.valueOf(1));
        List<BusRoute> list = result.stream().map(BusRouteMapper::toEntity).toList();
        long i = busSelect.selectBusStationCount();
        if (list.size() == i) {
            log.info("변경된 사항이 없습니다. : DB size -> " + i + " || open api size ->  " + list.size());
            return;
        }
        log.info("변경된 사항이 존재합니다. : DB size -> " + i + " || open api size ->  " + list.size());
        busAppend.saveAll(list);
    }
}
