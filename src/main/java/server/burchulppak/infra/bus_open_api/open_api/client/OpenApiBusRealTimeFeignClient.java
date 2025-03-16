package server.burchulppak.infra.bus_open_api.open_api.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import server.burchulppak.infra.bus_open_api.open_api.config.OpenApiFeignClientConfiguration;
import server.burchulppak.infra.bus_open_api.open_api.dto.OpenApiResponse;
import server.burchulppak.infra.bus_open_api.open_api.dto.RealTimeOpenApiResponse;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRealTimeOpenApiRequest;

@FeignClient(
        name = "seoulBusOpenApi",
        url = "http://ws.bus.go.kr/api/rest/arrive/getLowArrInfoByStId",
        configuration = OpenApiFeignClientConfiguration.class
)
public interface OpenApiBusRealTimeFeignClient {

    @GetMapping()
    RealTimeOpenApiResponse<BusRealTimeOpenApiRequest> getBusRealTime(
            @RequestParam(value = "stId") String busStationId
    );

}
