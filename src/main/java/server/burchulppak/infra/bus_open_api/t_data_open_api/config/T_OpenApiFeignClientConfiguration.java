package server.burchulppak.infra.bus_open_api.t_data_open_api.config;

import feign.Request;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

public class T_OpenApiFeignClientConfiguration {

    @Bean
    public T_OpenApiRequestInterceptor openApiRequestInterceptor() {
        return new T_OpenApiRequestInterceptor();
    }

    @Bean
    public Request.Options feignOptions() {
        return new Request.Options(5, TimeUnit.SECONDS, 15, TimeUnit.SECONDS, true);
    }


}
