package server.burchulppak.infra.bus_open_api.open_api.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public record BusRouteRequest(

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
