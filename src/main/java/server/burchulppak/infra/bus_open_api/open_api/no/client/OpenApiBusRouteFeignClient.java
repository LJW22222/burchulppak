package server.burchulppak.infra.bus_open_api.open_api.no.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.config.OpenApiRequestInterceptor;
import server.burchulppak.infra.bus_open_api.open_api.no.dto.OpenApiBusRouteResponse;
import server.burchulppak.infra.bus_open_api.open_api.no.vo.BusRouteOpenApiRequest;

@FeignClient(
        name = "tagoBusOpenApi",
        url = "https://apis.data.go.kr/1613000/BusRouteInfoInqireService",
        configuration = OpenApiRequestInterceptor.class
)
public interface OpenApiBusRouteFeignClient {

    @GetMapping("/getRouteNoList")
    OpenApiBusRouteResponse<BusRouteOpenApiRequest> getOpenAPiBusRoute(
        @RequestParam(value = "pageNo", defaultValue = "1", required = false) String pageNo,
        @RequestParam(value = "numOfRows", defaultValue = "100", required = false) String numOfRows,
        @RequestParam(value = "cityCode") String cityCode,
        @RequestParam(value = "routeNo") String routeNo
    );

}
