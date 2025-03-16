package server.burchulppak.infra.bus_open_api.t_data_open_api.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import server.burchulppak.domain.bus.BusStationAreaType;
import server.burchulppak.domain.bus.BusStationType;
import server.burchulppak.domain.bus.vo.BusRouteInfo;

import java.util.List;

public record BusRouteInfoRequest(
        @JsonProperty("linkId") String linkId, // 링크 ID
        @JsonProperty("sttnNo") String stationNo, // 정류장 번호
        @JsonProperty("crdntX") String coordinateX, // 좌표 X
        @JsonProperty("crdntY") String coordinateY, // 좌표 Y
        @JsonProperty("mapngX") String mappingX, // 매칭좌표 X
        @JsonProperty("mapngY") String mappingY, // 매칭좌표 Y
        @JsonProperty("areaId") String areaId, // 지역 ID
        @JsonProperty("histId") String historyId, // 이력 ID
        @JsonProperty("dstnc") String distance, // 거리
        @JsonProperty("sttnId") String stationId, // 정류장 ID
        @JsonProperty("sttnNm") String stationName, // 정류장 이름
        @JsonProperty("sttnTy") String stationType, // 정류장 유형 (STN_LANE)
        @JsonProperty("sttnDc") String stationDescription, // 정류장 설명
        @JsonProperty("headAngle") String headAngle, // 헤딩 각도
        @JsonProperty("voiceId") String voiceId, // 음성 ID
        @JsonProperty("sttnUseAt") String stationUseAt, // 정류장 이용 여부 (USEYN)
        @JsonProperty("bitInstlAt") String bitInstallAt, // BIT 설치 여부 (INSTL_AT)
        @JsonProperty("sttnAreaTy") String stationAreaType, // 정류장 지역 유형 (STN_RGNTP)
        @JsonProperty("sttnVirtlAt") String stationVirtualAt, // 정류장 가상 여부 (STN_VTL)
        @JsonProperty("sttnNmEng") String stationNameEnglish, // 정류장 이름 (영문)
        @JsonProperty("sttnDlyp") String stationDlyp, // 정류장 구분 (ST_TYPE)
        @JsonProperty("sttnSe") String stationSe, // 정류장 구분 (ST_TYPE)
        @JsonProperty("sttnBay") String stationBay // 정류장 베이
) {

    public BusRouteInfo to() {
        return BusRouteInfo.builder()
                .englishRouteName(stationNameEnglish)
                .koreaRouteName(stationName)
                .routeId(stationId)
                .busRouteStationArea(BusStationAreaType.to(stationAreaType))
                .busStationType(BusStationType.to(stationType))
                .build();
    }

}
