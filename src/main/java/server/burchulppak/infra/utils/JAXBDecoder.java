package server.burchulppak.infra.utils;

import feign.Response;
import feign.codec.Decoder;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.dto.OpenApiBusRealTimeResponse;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class JAXBDecoder implements Decoder {

    @Override
    public Object decode(Response response, Type type) throws IOException {
        Response.Body body = response.body();
        if (body == null) {
            throw new IOException("응답 본문이 비어 있습니다.");
        }

        try (InputStream inputStream = body.asInputStream()) {

            Class<?> clazz = getClass(type);

            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(inputStream);  // 반환할 때는 변환된 객체 반환

        } catch (JAXBException e) {
            throw new IOException("XML 변환 오류", e);
        }
    }

    private static Class<?> getClass(Type type) throws IOException {
        Class<?> clazz;

        if (type instanceof Class) {
            clazz = (Class<?>) type;
        } else if (type instanceof ParameterizedType) {
            // 제네릭 타입의 RawType을 Class로 변환
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                clazz = (Class<?>) rawType;
            } else {
                throw new IOException("지원되지 않는 rawType: " + rawType.getTypeName());
            }
        } else {
            throw new IOException("지원되지 않는 타입: " + type.getTypeName());
        }
        return clazz;
    }
}
