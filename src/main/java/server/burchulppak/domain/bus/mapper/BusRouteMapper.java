package server.burchulppak.domain.bus.mapper;

import server.burchulppak.domain.bus.entity.BusRoute;
import server.burchulppak.domain.bus.vo.BusRouteInfo;

public class BusRouteMapper {

    public static BusRoute toEntity(BusRouteInfo openAPiBusRouteInfo) {
        return BusRoute.builder()
                .englishRouteName(openAPiBusRouteInfo.englishRouteName())
                .koreaRouteName(openAPiBusRouteInfo.koreaRouteName())
                .routeId(openAPiBusRouteInfo.routeId())
                .busRouteStationArea(openAPiBusRouteInfo.busRouteStationArea())
                .busStationType(openAPiBusRouteInfo.busStationType())
                .build();
    }

}
