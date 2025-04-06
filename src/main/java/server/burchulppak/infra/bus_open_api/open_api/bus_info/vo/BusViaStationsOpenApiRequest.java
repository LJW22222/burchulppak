package server.burchulppak.infra.bus_open_api.open_api.bus_info.vo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import server.burchulppak.domain.bus.vo.BusStationInfoRequest;

@XmlRootElement(name = "itemList")
@Getter
public class BusViaStationsOpenApiRequest {

    @XmlElement(name = "busRouteId")
    private String busRouteId;
    @XmlElement(name = "busRouteNm")
    private String busRouteNm;
    @XmlElement(name = "seq")
    private String seq;
    @XmlElement(name = "section")
    private String section;
    @XmlElement(name = "station")
    private String station;
    @XmlElement(name = "stationNm")
    private String stationNm;
    @XmlElement(name = "gpsX")
    private String gpsX;
    @XmlElement(name = "gpsY")
    private String gpsY;
    @XmlElement(name = "direction")
    private String direction;
    @XmlElement(name = "stationNo")
    private String stationNo;
    @XmlElement(name = "routeType")
    private String routeType;
    @XmlElement(name = "beginTm")
    private String beginTm;
    @XmlElement(name = "lastTm")
    private String lastTm;
    @XmlElement(name = "posX")
    private String posX;
    @XmlElement(name = "posY")
    private String posY;
    @XmlElement(name = "arsId")
    private String arsId;
    @XmlElement(name = "transYn")
    private String transYn;
    @XmlElement(name = "trnstnid")
    private String trnstnid;
    @XmlElement(name = "sectSpd")
    private String sectSpd;
    @XmlElement(name = "fullSectDist")
    private String fullSectDist;

    public BusStationInfoRequest to() {
        return new BusStationInfoRequest(stationNm, direction, transYn, beginTm, lastTm, fullSectDist);
    }
}

