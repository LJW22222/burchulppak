package server.burchulppak.domain.bus.vo;

import lombok.Builder;

import java.util.List;

@Builder
public record BusViaStationRequest(

        String busRouteNm,
        String busRouteId,
        List<BusStationInfoRequest> busStationInf


) {
}
