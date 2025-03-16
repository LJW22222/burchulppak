package server.burchulppak.infra.bus_open_api.open_api.vo;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.ToString;
import server.burchulppak.domain.bus.vo.BusRealTimeRequest;

@Getter
@XmlRootElement(name = "itemList")
@ToString
public class BusRealTimeOpenApiRequest {

    @XmlElement(name = "arrmsg1") String arrmsg1;
    @XmlElement(name = "arrmsg2") String arrmsg2;
    @XmlElement(name = "arsId") String arsId;
    @XmlElement(name = "avgCf1") String avgCf1;
    @XmlElement(name = "avgCf2") String avgCf2;
    @XmlElement(name = "brdrde_Num1") String brdrde_Num1;
    @XmlElement(name = "brdrde_Num2") String brdrde_Num2;
    @XmlElement(name = "brerde_Div1") String brerde_Div1;
    @XmlElement(name = "brerde_Div2") String brerde_Div2;
    @XmlElement(name = "busRouteAbrv") String busRouteAbrv;
    @XmlElement(name = "busRouteId") String busRouteId;
    @XmlElement(name = "busType1") String busType1;
    @XmlElement(name = "busType2") String busType2;
    @XmlElement(name = "deTourAt") String deTourAt;
    @XmlElement(name = "dir") String dir;
    @XmlElement(name = "expCf1") String expCf1;
    @XmlElement(name = "expCf2") String expCf2;
    @XmlElement(name = "exps1") String exps1;
    @XmlElement(name = "exps2") String exps2;
    @XmlElement(name = "firstTm") String firstTm;
    @XmlElement(name = "full1") String full1;
    @XmlElement(name = "full2") String full2;
    @XmlElement(name = "goal1") String goal1;
    @XmlElement(name = "goal2") String goal2;
    @XmlElement(name = "isArrive1") String isArrive1;
    @XmlElement(name = "isArrive2") String isArrive2;
    @XmlElement(name = "isLast1") String isLast1;
    @XmlElement(name = "isLast2") String isLast2;
    @XmlElement(name = "kalCf1") String kalCf1;
    @XmlElement(name = "kalCf2") String kalCf2;
    @XmlElement(name = "kals1") String kals1;
    @XmlElement(name = "kals2") String kals2;
    @XmlElement(name = "lastTm") String lastTm;
    @XmlElement(name = "mkTm") String mkTm;
    @XmlElement(name = "namin2Sec1") String namin2Sec1;
    @XmlElement(name = "namin2Sec2") String namin2Sec2;
    @XmlElement(name = "neuCf1") String neuCf1;
    @XmlElement(name = "neuCf2") String neuCf2;
    @XmlElement(name = "neus1") String neus1;
    @XmlElement(name = "neus2") String neus2;
    @XmlElement(name = "nextBus") String nextBus;
    @XmlElement(name = "nmain2Ord1") String nmain2Ord1;
    @XmlElement(name = "nmain2Ord2") String nmain2Ord2;
    @XmlElement(name = "nmain2Stnid1") String nmain2Stnid1;
    @XmlElement(name = "nmain2Stnid2") String nmain2Stnid2;
    @XmlElement(name = "nmain3Ord1") String nmain3Ord1;
    @XmlElement(name = "nmain3Ord2") String nmain3Ord2;
    @XmlElement(name = "nmain3Sec1") String nmain3Sec1;
    @XmlElement(name = "nmain3Sec2") String nmain3Sec2;
    @XmlElement(name = "nmain3Stnid1") String nmain3Stnid1;
    @XmlElement(name = "nmain3Stnid2") String nmain3Stnid2;
    @XmlElement(name = "nmainOrd1") String nmainOrd1;
    @XmlElement(name = "nmainOrd2") String nmainOrd2;
    @XmlElement(name = "nmainSec1") String nmainSec1;
    @XmlElement(name = "nmainSec2") String nmainSec2;
    @XmlElement(name = "nmainStnid1") String nmainStnid1;
    @XmlElement(name = "nmainStnid2") String nmainStnid2;
    @XmlElement(name = "nstnId1") String nstnId1;
    @XmlElement(name = "nstnId2") String nstnId2;
    @XmlElement(name = "nstnOrd1") String nstnOrd1;
    @XmlElement(name = "nstnOrd2") String nstnOrd2;
    @XmlElement(name = "nstnSec1") String nstnSec1;
    @XmlElement(name = "nstnSec2") String nstnSec2;
    @XmlElement(name = "nstnSpd1") String nstnSpd1;
    @XmlElement(name = "nstnSpd2") String nstnSpd2;
    @XmlElement(name = "plainNo1") String plainNo1;
    @XmlElement(name = "plainNo2") String plainNo2;
    @XmlElement(name = "repTm1") String repTm1;
    @XmlElement(name = "rerdie_Div1") String rerdie_Div1;
    @XmlElement(name = "rerdie_Div2") String rerdie_Div2;
    @XmlElement(name = "reride_Num1") String reride_Num1;
    @XmlElement(name = "reride_Num2") String reride_Num2;
    @XmlElement(name = "routeType") String routeType;
    @XmlElement(name = "rtNm") String rtNm;
    @XmlElement(name = "sectOrd1") String sectOrd1;
    @XmlElement(name = "sectOrd2") String sectOrd2;
    @XmlElement(name = "stId") String stId;
    @XmlElement(name = "stNm") String stNm;
    @XmlElement(name = "staOrd") String staOrd;
    @XmlElement(name = "stationNm1") String stationNm1;  // 추가된 필드
    @XmlElement(name = "stationNm2") String stationNm2;  // 추가된 필드
    @XmlElement(name = "term") String term;
    @XmlElement(name = "traSpd1") String traSpd1;
    @XmlElement(name = "traSpd2") String traSpd2;
    @XmlElement(name = "traTime1") String traTime1;
    @XmlElement(name = "traTime2") String traTime2;
    @XmlElement(name = "vehId1") String vehId1;
    @XmlElement(name = "vehId2") String vehId2;


    public BusRealTimeRequest to() {
        return BusRealTimeRequest.builder()
                .arrmsg1(arrmsg1)
                .traTime1(traTime1)
                .arrmsg2(arrmsg2)
                .traTime2(traTime2)
                .busRouteAbrv(busRouteAbrv)
                .firstTime(firstTm)
                .lastTime(lastTm)
                .build();
    }
    // Getters and setters 추가 필요
}
