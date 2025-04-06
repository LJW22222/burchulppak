package server.burchulppak.api.vo;

import lombok.Builder;
import server.burchulppak.domain.bus.vo.BusRealTimeRequest;

@Builder
public record BusRealTimeResponse(

        //첫번째 버스
        String arrmsg1,
        String traTime1, //도착 예정 시간 [ 초 ]

        //두번째 버스
        String arrmsg2,
        String traTime2, //도착 예정 시간 [ 초 ]

        //버스 관련 정보
        //버스 번호 [ 예 : 6648 ]
        String busRouteAbrv,
        String firstTime,
        String lastTime,
        String busRouteId

) {

    public static BusRealTimeResponse of(BusRealTimeRequest busRealTimeRequest) {
        return BusRealTimeResponse.builder()
                .arrmsg1(busRealTimeRequest.arrmsg1())
                .traTime1(busRealTimeRequest.traTime1())
                .arrmsg2(busRealTimeRequest.arrmsg2())
                .traTime2(busRealTimeRequest.traTime2())
                .busRouteAbrv(busRealTimeRequest.busRouteAbrv())
                .firstTime(busRealTimeRequest.firstTime())
                .lastTime(busRealTimeRequest.lastTime())
                .busRouteId(busRealTimeRequest.busRouteId())
                .build();
    }

}
