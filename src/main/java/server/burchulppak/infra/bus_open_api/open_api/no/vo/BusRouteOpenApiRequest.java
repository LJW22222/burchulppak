package server.burchulppak.infra.bus_open_api.open_api.no.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BusRouteOpenApiRequest(

        @JsonProperty("endnodenm")
        String endnodenm,

        @JsonProperty("endvehicletime")
        String endvehicletime,

        @JsonProperty("routeid")
        String routeid,

        @JsonProperty("routetp")
        String routetp,

        @JsonProperty("startnodenm")
        String startnodenm,

        @JsonProperty("startvehicletime")
        String startvehicletime

) {
}
