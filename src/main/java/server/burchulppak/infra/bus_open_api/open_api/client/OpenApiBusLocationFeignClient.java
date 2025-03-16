package server.burchulppak.infra.bus_open_api.open_api.client;


import org.springframework.cloud.openfeign.FeignClient;
import server.burchulppak.infra.bus_open_api.open_api.config.OpenApiFeignClientConfiguration;

@FeignClient(
        name = "busLocationOpenApi",
        url = "https://ws.bus.go.kr/api/rest/arrive/getArrInfoByRouteAll",
        configuration = OpenApiFeignClientConfiguration.class
)
public interface OpenApiBusLocationFeignClient {

//    @GetMapping()
//    OpenApiResponse<?> getBusLocation(
//            @RequestParam(value = "busRouteId") String busRouteId
//    );
}
