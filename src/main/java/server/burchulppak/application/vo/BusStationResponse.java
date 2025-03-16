package server.burchulppak.application.vo;

import server.burchulppak.domain.bus.vo.BusStation;

public record BusStationResponse(

        String busStationName,
        String busStationId

) {

    public static BusStationResponse of(BusStation busStation) {
        return new BusStationResponse(busStation.busStationName(), busStation.busStationId());
    }
}
