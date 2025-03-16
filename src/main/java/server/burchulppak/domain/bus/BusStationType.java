package server.burchulppak.domain.bus;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BusStationType {

    //공용
    PUBLIC_TYPE("0"),
    //일반형 시내/농어촌
    NORMAL_TYPE("1"),
    //좌석형 시내/농어촌
    SEAT_TYPE("2"),
    //직행 좌석형 시내/농어촌
    DIRECT_SEAT_TYPE("3"),
    //일반형 시외버스
    GENERAL_INTERCITY_TYPE_FIVE("4"),
    //좌석형 시외버스
    SEATED_INTERCITY_TYPE_SIX("5"),
    //고속형 시외버스
    EXPRESS_INTERCITY_TYPE_SEVEN("6"),
    //마을버스
    VILLAGE_BUS("7"),
    NONE("-");

    private final String number;


    public static BusStationType to(String number) {
        for (BusStationType value : BusStationType.values()) {
            if(value.getNumber().equals(number)) {
                return value;
            }
        }
        return NONE;
    }
}
