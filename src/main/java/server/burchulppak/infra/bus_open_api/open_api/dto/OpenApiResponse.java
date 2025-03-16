package server.burchulppak.infra.bus_open_api.open_api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.List;

public record OpenApiResponse<T>(@JsonProperty("response") Response<T> response) {

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
