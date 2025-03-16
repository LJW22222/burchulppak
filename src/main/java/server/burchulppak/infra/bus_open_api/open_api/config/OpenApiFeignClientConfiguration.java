package server.burchulppak.infra.bus_open_api.open_api.config;

import feign.codec.Decoder;
import feign.codec.Encoder;
import jakarta.xml.bind.JAXB;
import org.springframework.cloud.openfeign.support.SpringDecoder;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import server.burchulppak.infra.bus_open_api.open_api.dto.RealTimeOpenApiResponse;
import server.burchulppak.infra.utils.JAXBDecoder;

public class OpenApiFeignClientConfiguration {

    @Bean
    public OpenApiRequestInterceptor openApiRequestInterceptor() {
        return new OpenApiRequestInterceptor();
    }

    @Bean
    public Decoder feignDecoder() {
        return new JAXBDecoder();
    }

//    public Encoder feignEncoder() {
//        return new JAXBEncoder();
//    }

}
