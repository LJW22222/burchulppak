package server.burchulppak.infra.bus_open_api.open_api.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;

public class OpenApiRequestInterceptor implements RequestInterceptor {

    @Value("${open_api_bus.key.route}")
    private String serviceKey;

    @Override
    public void apply(RequestTemplate template) {
        template.header("Content-type", "application/json");
        template.query("serviceKey", serviceKey);
    }
}
