package server.burchulppak.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import server.burchulppak.api.global.dto.Response;
import server.burchulppak.api.vo.BusRealTimeResponse;
import server.burchulppak.api.vo.BusStationResponse;

import server.burchulppak.api.vo.BusViaInfo;
import server.burchulppak.api.vo.BusViaStationResponse;
import server.burchulppak.application.bus.BusServiceUseCase;
import server.burchulppak.domain.bus.vo.BusViaStationRequest;


import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bus")
public class BusController {

    private final BusServiceUseCase busServiceUseCase;

    @Operation(summary = "실시간 버스 도착 정보 조회", description = "실시간 버스 도착 정보 조회 API")
    @Parameters({
            @Parameter(name = "busStationId", description = "정류장 ID", example = "115000108")
    })
    @GetMapping("/real/time")
    public Response<List<BusRealTimeResponse>> getBusRealTime(@RequestParam("busStationId")String busStationId) {
        return Response.success(busServiceUseCase.getOpenAPiBusRealTime(busStationId).stream().map(BusRealTimeResponse::of).toList());
    }

    @Operation(summary = "정류장 정보 조회 [ 정류장 ID ]", description = "양방향 통신 소켓 메세지 전송 API")
    @Parameters({
            @Parameter(name = "busStationName", description = "정류장 이름", example = "화곡역 5번 출구")
    })
    @GetMapping("/station")
    public Response<List<BusStationResponse>> getBusStation(@RequestParam("busStationName") String busStationName) {
        return Response.success(busServiceUseCase.getOpenAPiBusStationList(busStationName).stream().map(BusStationResponse::of).toList());
    }

    @Operation(summary = "버스 노선도 조회", description = "버스 노선도 조회 API")
    @Parameters({
            @Parameter(name = "busRouteId", description = "버스 고유 ID", example = "115000108")
    })
    @GetMapping("/via/stations")
    public Response<BusViaStationResponse> getBusViaStation(@RequestParam("busRouteId")String busRouteId) {
        BusViaStationRequest openAPiBusViaStation = busServiceUseCase.getOpenAPiBusViaStation(busRouteId);
        return Response.success(new BusViaStationResponse(openAPiBusViaStation.busRouteNm(), openAPiBusViaStation.busRouteId(),
                openAPiBusViaStation.busStationInf()
                .stream()
                .map(BusViaInfo::to)
                .toList()));
    }

}
