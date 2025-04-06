package server.burchulppak.infra.bus_open_api.open_api.bus_info.vo;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;
import server.burchulppak.domain.bus.vo.BusRealTimeRequest;

@Getter
@XmlRootElement(name = "itemList")
@ToString
public class BusRealTimeOpenApiRequest {

    @XmlElement(name = "arrmsg1") private String arrmsg1;
    @XmlElement(name = "arrmsg2") private String arrmsg2;
    @XmlElement(name = "arsId") private String arsId;
    @XmlElement(name = "avgCf1") private String avgCf1;
    @XmlElement(name = "avgCf2") private String avgCf2;
    @XmlElement(name = "brdrde_Num1") private String brdrde_Num1;
    @XmlElement(name = "brdrde_Num2") private String brdrde_Num2;
    @XmlElement(name = "brerde_Div1") private String brerde_Div1;
    @XmlElement(name = "brerde_Div2") private String brerde_Div2;
    @XmlElement(name = "busRouteAbrv") private String busRouteAbrv;
    @XmlElement(name = "busRouteId") private String busRouteId;
    @XmlElement(name = "busType1") private String busType1;
    @XmlElement(name = "busType2") private String busType2;
    @XmlElement(name = "deTourAt") private String deTourAt;
    @XmlElement(name = "dir") private String dir;
    @XmlElement(name = "expCf1") private String expCf1;
    @XmlElement(name = "expCf2") private String expCf2;
    @XmlElement(name = "exps1") private String exps1;
    @XmlElement(name = "exps2") private String exps2;
    @XmlElement(name = "firstTm") private String firstTm;
    @XmlElement(name = "full1") private String full1;
    @XmlElement(name = "full2") private String full2;
    @XmlElement(name = "goal1") private String goal1;
    @XmlElement(name = "goal2") private String goal2;
    @XmlElement(name = "isArrive1") private String isArrive1;
    @XmlElement(name = "isArrive2") private String isArrive2;
    @XmlElement(name = "isLast1") private String isLast1;
    @XmlElement(name = "isLast2") private String isLast2;
    @XmlElement(name = "kalCf1") private String kalCf1;
    @XmlElement(name = "kalCf2") private String kalCf2;
    @XmlElement(name = "kals1") private String kals1;
    @XmlElement(name = "kals2") private String kals2;
    @XmlElement(name = "lastTm") private String lastTm;
    @XmlElement(name = "mkTm") private String mkTm;
    @XmlElement(name = "namin2Sec1") private String namin2Sec1;
    @XmlElement(name = "namin2Sec2") private String namin2Sec2;
    @XmlElement(name = "neuCf1") private String neuCf1;
    @XmlElement(name = "neuCf2") private String neuCf2;
    @XmlElement(name = "neus1") private String neus1;
    @XmlElement(name = "neus2") private String neus2;
    @XmlElement(name = "nextBus") private String nextBus;
    @XmlElement(name = "nmain2Ord1") private String nmain2Ord1;
    @XmlElement(name = "nmain2Ord2") private String nmain2Ord2;
    @XmlElement(name = "nmain2Stnid1") private String nmain2Stnid1;
    @XmlElement(name = "nmain2Stnid2") private String nmain2Stnid2;
    @XmlElement(name = "nmain3Ord1") private String nmain3Ord1;
    @XmlElement(name = "nmain3Ord2") private String nmain3Ord2;
    @XmlElement(name = "nmain3Sec1") private String nmain3Sec1;
    @XmlElement(name = "nmain3Sec2") private String nmain3Sec2;
    @XmlElement(name = "nmain3Stnid1") private String nmain3Stnid1;
    @XmlElement(name = "nmain3Stnid2") private String nmain3Stnid2;
    @XmlElement(name = "nmainOrd1") private String nmainOrd1;
    @XmlElement(name = "nmainOrd2") private String nmainOrd2;
    @XmlElement(name = "nmainSec1") private String nmainSec1;
    @XmlElement(name = "nmainSec2") private String nmainSec2;
    @XmlElement(name = "nmainStnid1") private String nmainStnid1;
    @XmlElement(name = "nmainStnid2") private String nmainStnid2;
    @XmlElement(name = "nstnId1") private String nstnId1;
    @XmlElement(name = "nstnId2") private String nstnId2;
    @XmlElement(name = "nstnOrd1") private String nstnOrd1;
    @XmlElement(name = "nstnOrd2") private String nstnOrd2;
    @XmlElement(name = "nstnSec1") private String nstnSec1;
    @XmlElement(name = "nstnSec2") private String nstnSec2;
    @XmlElement(name = "nstnSpd1") private String nstnSpd1;
    @XmlElement(name = "nstnSpd2") private String nstnSpd2;
    @XmlElement(name = "plainNo1") private String plainNo1;
    @XmlElement(name = "plainNo2") private String plainNo2;
    @XmlElement(name = "repTm1") private String repTm1;
    @XmlElement(name = "rerdie_Div1") private String rerdie_Div1;
    @XmlElement(name = "rerdie_Div2") private String rerdie_Div2;
    @XmlElement(name = "reride_Num1") private String reride_Num1;
    @XmlElement(name = "reride_Num2") private String reride_Num2;
    @XmlElement(name = "routeType") private String routeType;
    @XmlElement(name = "rtNm") private String rtNm;
    @XmlElement(name = "sectOrd1") private String sectOrd1;
    @XmlElement(name = "sectOrd2") private String sectOrd2;
    @XmlElement(name = "stId") private String stId;
    @XmlElement(name = "stNm") private String stNm;
    @XmlElement(name = "staOrd") private String staOrd;
    @XmlElement(name = "stationNm1") private String stationNm1;  // 추가된 필드
    @XmlElement(name = "stationNm2") private String stationNm2;  // 추가된 필드
    @XmlElement(name = "term") private String term;
    @XmlElement(name = "traSpd1") private String traSpd1;
    @XmlElement(name = "traSpd2") private String traSpd2;
    @XmlElement(name = "traTime1") private String traTime1;
    @XmlElement(name = "traTime2") private String traTime2;
    @XmlElement(name = "vehId1") private String vehId1;
    @XmlElement(name = "vehId2") private String vehId2;

    public BusRealTimeRequest to() {
        return BusRealTimeRequest.builder()
                .arrmsg1(arrmsg1)
                .traTime1(traTime1)
                .arrmsg2(arrmsg2)
                .traTime2(traTime2)
                .busRouteAbrv(busRouteAbrv)
                .firstTime(firstTm)
                .lastTime(lastTm)
                .busRouteId(busRouteId)
                .build();
    }
}
