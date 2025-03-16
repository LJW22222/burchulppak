package server.burchulppak.domain.bus.vo;

import lombok.Builder;
import server.burchulppak.domain.bus.BusStationAreaType;
import server.burchulppak.domain.bus.BusStationType;

@Builder
public record BusRouteInfo(

        String englishRouteName,

        String koreaRouteName,

        String routeId,

        BusStationAreaType busRouteStationArea,

        BusStationType busStationType


) {

}
