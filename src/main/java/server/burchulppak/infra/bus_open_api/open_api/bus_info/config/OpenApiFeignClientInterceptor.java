package server.burchulppak.infra.bus_open_api.open_api.bus_info.config;

import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;
import server.burchulppak.infra.utils.JAXBDecoder;

public class OpenApiFeignClientInterceptor {

    @Bean
    public OpenApiRequestInterceptor openApiRequestInterceptor() {
        return new OpenApiRequestInterceptor();
    }

    @Bean
    public Decoder feignDecoder() {
        return new JAXBDecoder();
    }
}
