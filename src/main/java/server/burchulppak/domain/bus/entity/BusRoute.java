package server.burchulppak.domain.bus.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import server.burchulppak.domain.bus.BusStationAreaType;
import server.burchulppak.domain.bus.BusStationType;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BusRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String englishRouteName;

    private String koreaRouteName;

    private String routeId;

    @Enumerated(EnumType.STRING)
    private BusStationAreaType busRouteStationArea;

    @Enumerated(EnumType.STRING)
    private BusStationType busStationType;

    @Builder
    public BusRoute(String englishRouteName, String koreaRouteName, String routeId, BusStationAreaType busRouteStationArea, BusStationType busStationType) {
        this.englishRouteName = englishRouteName;
        this.koreaRouteName = koreaRouteName;
        this.routeId = routeId;
        this.busRouteStationArea = busRouteStationArea;
        this.busStationType = busStationType;
    }

}
