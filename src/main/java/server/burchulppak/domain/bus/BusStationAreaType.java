package server.burchulppak.domain.bus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BusStationAreaType {

    SEOUL("0"),
    INCHEON("2"),
    GYEONGGI_DO("4"),
    NONE("-");
    private final String areaNumber;

    public static BusStationAreaType to(String areaNumber) {
        for (BusStationAreaType value : BusStationAreaType.values()) {
            if(value.getAreaNumber().equals(areaNumber)) {
                return value;
            }
        }
        return NONE;
    }

}
