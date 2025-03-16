package server.burchulppak.domain.bus.vo;

import lombok.Builder;

@Builder
public record BusRealTimeRequest(


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
        String lastTime


) {
}
