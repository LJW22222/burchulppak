package server.burchulppak.infra.bus_open_api.t_data_open_api.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Value;

public class T_OpenApiRequestInterceptor implements RequestInterceptor {

    @Value("${t_data.key.bus}")
    private String serviceKey;

    @Override
    public void apply(RequestTemplate template) {
        template.header("Content-type", "application/json");
        template.query("apikey", serviceKey);
    }
}
