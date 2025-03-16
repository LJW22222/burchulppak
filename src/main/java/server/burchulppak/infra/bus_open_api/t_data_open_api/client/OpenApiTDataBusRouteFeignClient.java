package server.burchulppak.infra.bus_open_api.t_data_open_api.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import server.burchulppak.infra.bus_open_api.t_data_open_api.config.T_OpenApiFeignClientConfiguration;
import server.burchulppak.infra.bus_open_api.t_data_open_api.vo.BusRouteInfoRequest;

import java.util.List;

@FeignClient(
        name = "TDataBusOpenApi",
        url = "https://t-data.seoul.go.kr",
        configuration = T_OpenApiFeignClientConfiguration.class
)
public interface OpenApiTDataBusRouteFeignClient {

    @GetMapping("/apig/apiman-gateway/tapi/BisTbisMsSttn/1.0")
    List<BusRouteInfoRequest> getOpenAPiBusRoute(
            @RequestParam("startRow") String startRow,
            @RequestParam("rowCnt") String rowCnt
    );

}
