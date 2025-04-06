package server.burchulppak.infra.bus_open_api.open_api.bus_info.dto;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;
import server.burchulppak.infra.bus_open_api.open_api.bus_info.vo.BusViaStationsOpenApiRequest;

import java.util.List;

@Getter
@XmlRootElement(name = "ServiceResult")
@ToString
public class OpenApiBusViaStationResponse<T> {

    @XmlElement(name = "msgHeader")
    private Response.Header header;
    @XmlElement(name = "msgBody")
    private Response.Body body;


    @Getter
    @ToString
    public static class Response<T> {
        @XmlElement(name = "msgHeader")
        private Header header;
        @XmlElement(name = "msgBody")
        private Body body;


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
        public static class Body {
            @XmlElement(name = "itemList")
            private List<BusViaStationsOpenApiRequest> itemList;
        }
    }
}
