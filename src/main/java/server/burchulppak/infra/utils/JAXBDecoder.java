package server.burchulppak.infra.utils;

import feign.Response;
import feign.codec.Decoder;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import server.burchulppak.infra.bus_open_api.open_api.dto.RealTimeOpenApiResponse;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRealTimeOpenApiRequest;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class JAXBDecoder implements Decoder {

    @Override
    public Object decode(Response response, Type type) throws IOException {
        Response.Body body = response.body();
        if (body == null) {
            throw new IOException("응답 본문이 비어 있습니다.");
        }

        try (InputStream inputStream = body.asInputStream()) {

            // JAXBContext를 생성하고 XML을 Java 객체로 변환
            JAXBContext context = JAXBContext.newInstance(RealTimeOpenApiResponse.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(inputStream);  // 반환할 때는 변환된 객체 반환

        } catch (JAXBException e) {
            throw new IOException("XML 변환 오류", e);
        }
    }
}
