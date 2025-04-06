package server.burchulppak.api.vo;

import server.burchulppak.domain.bus.vo.BusStationInfoRequest;

import java.util.List;

public record BusViaStationResponse(

        String busRouteNm,
        String busRouteId,
        List<BusViaInfo> busStationInf


) {
}
