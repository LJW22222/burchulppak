package server.burchulppak.infra.bus_open_api.open_api.bus_info.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.config.OpenApiFeignClientInterceptor;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.dto.OpenApiBusRealTimeResponse;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.vo.BusRealTimeOpenApiRequest;

@FeignClient(
        name = "seoulBusOpenApi",
        url = "http://ws.bus.go.kr/api/rest/arrive/getLowArrInfoByStId",
        configuration = OpenApiFeignClientInterceptor.class
)
public interface OpenApiBusRealTimeFeignClient {

    @GetMapping()
    OpenApiBusRealTimeResponse<BusRealTimeOpenApiRequest> getBusRealTime(
            @RequestParam(value = "stId") String busStationId
    );

}
