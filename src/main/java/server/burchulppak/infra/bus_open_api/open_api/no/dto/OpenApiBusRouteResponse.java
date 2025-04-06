package server.burchulppak.infra.bus_open_api.open_api.no.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record OpenApiBusRouteResponse<T>(@JsonProperty("response") Response<T> response) {

    public record Response<T>(
            @JsonProperty("header") Header header, @JsonProperty("body") Body<T> body) {

        public record Header(
                @JsonProperty("reqNo") String reqNo,
                @JsonProperty("resultCode") String resultCode,
                @JsonProperty("resultMsg") String resultMessage) {
        }

        public record Body<T>(
                @JsonProperty("items") List<T> item ) {}
    }

    public List<T> getItem() {
        return response.body.item;
    }

}
