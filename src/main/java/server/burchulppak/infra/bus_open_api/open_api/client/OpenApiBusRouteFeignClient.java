package server.burchulppak.infra.bus_open_api.open_api.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import server.burchulppak.infra.bus_open_api.open_api.config.OpenApiFeignClientConfiguration;
import server.burchulppak.infra.bus_open_api.open_api.dto.OpenApiResponse;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRouteRequest;

@FeignClient(
        name = "tagoBusOpenApi",
        url = "https://apis.data.go.kr/1613000/BusRouteInfoInqireService",
        configuration = OpenApiFeignClientConfiguration.class
)
public interface OpenApiBusRouteFeignClient {

    @GetMapping("/getRouteNoList")
    OpenApiResponse<BusRouteRequest> getOpenAPiBusRoute(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) String pageNo,
        @RequestParam(value = "numOfRows", defaultValue = "100", required = false) String numOfRows,
        @RequestParam(value = "cityCode") String cityCode,
        @RequestParam(value = "routeNo") String routeNo
    );

}
