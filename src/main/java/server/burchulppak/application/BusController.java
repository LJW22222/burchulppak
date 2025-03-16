package server.burchulppak.application;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import server.burchulppak.application.vo.BusRealTimeResponse;
import server.burchulppak.application.vo.BusStationResponse;
import server.burchulppak.domain.bus.vo.BusRealTimeRequest;

import server.burchulppak.domain.bus.BusServiceUseCase;


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
    public ResponseEntity<List<BusRealTimeResponse>> getBusRealTime(@RequestParam("busStationId")String busStationId) {
        return ResponseEntity.ok(busServiceUseCase.getOpenAPiBusRealTime(busStationId).stream().map(BusRealTimeResponse::of).toList());
    }

    @Operation(summary = "정류장 정보 조회 [ 정류장 ID ]", description = "양방향 통신 소켓 메세지 전송 API")
    @Parameters({
            @Parameter(name = "busStationName", description = "정류장 이름", example = "화곡역 5번 출구")
    })
    @GetMapping("/station")
    public ResponseEntity<List<BusStationResponse>> getBusStation(@RequestParam("busStationName") String busStationName) {
        return ResponseEntity.ok(busServiceUseCase.getOpenAPiBusStationList(busStationName).stream().map(BusStationResponse::of).toList());
    }

}
