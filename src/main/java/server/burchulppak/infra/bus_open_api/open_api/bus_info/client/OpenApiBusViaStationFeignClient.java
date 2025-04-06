package server.burchulppak.infra.bus_open_api.open_api.bus_info.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.config.OpenApiFeignClientInterceptor;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.dto.OpenApiBusViaStationResponse;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.vo.BusViaStationsOpenApiRequest;

@FeignClient(
        name = "busLocationOpenApi",
        url = "http://ws.bus.go.kr/api/rest/busRouteInfo/getStaionByRoute",
        configuration = OpenApiFeignClientInterceptor.class
)
public interface OpenApiBusViaStationFeignClient {

    @GetMapping()
    OpenApiBusViaStationResponse<BusViaStationsOpenApiRequest> getBusViaStations(
            @RequestParam(value = "busRouteId") String busRouteId
    );
}
