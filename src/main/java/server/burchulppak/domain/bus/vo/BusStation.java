package server.burchulppak.domain.bus.vo;

import server.burchulppak.domain.bus.entity.BusRoute;

public record BusStation(

        String busStationName,
        String busStationId

) {


    public static BusStation of(BusRoute busRoute) {
        return new BusStation(busRoute.getKoreaRouteName(), busRoute.getRouteId());
    }
}
