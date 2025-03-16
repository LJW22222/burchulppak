package server.burchulppak.infra.bus_open_api.open_api.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;
import server.burchulppak.infra.bus_open_api.open_api.vo.BusRealTimeOpenApiRequest;

import java.util.List;

@Getter
@XmlRootElement(name = "ServiceResult")
@ToString
public class RealTimeOpenApiResponse<T> {

    @XmlElement(name = "msgHeader")
    private Response.Header header;
    @XmlElement(name = "msgBody")
    private Response.Body<T> body;


    @Getter
    @ToString
    public static class Response<T> {
        @XmlElement(name = "msgHeader")
        private Header header;
        @XmlElement(name = "msgBody")
        private Body<T> body;


        @Getter
        @ToString
        public static class Header {
            @XmlElement(name = "itemCount")
            private String reqNo;
            @XmlElement(name = "headerCd")
            private String resultCode;
            @XmlElement(name = "headerMsg")
            private String resultMessage;

        }

        @Getter
        @ToString
        public static class Body<T> {
            @XmlElement(name = "itemList")
            private List<BusRealTimeOpenApiRequest> itemList;

        }
    }
}
