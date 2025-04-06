package server.burchulppak.domain.bus.vo;

public record BusStationInfoRequest(

        //정류소 명
        String stationNm,
        //진행 방향 ( 버스가 진행하는 방향 )
        String direction,
        //회차지 여부 ( N , Y )
        String transYn,
        //첫차 시간
        String beginTm,
        //막차 시간
        String lastTm,
        //구간 거리
        String fullSectDist

) {
}
