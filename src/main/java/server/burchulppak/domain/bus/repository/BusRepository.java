package server.burchulppak.domain.bus.repository;

import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import server.burchulppak.domain.bus.entity.BusRoute;

import java.util.List;


public interface BusRepository extends JpaRepository<BusRoute, Long> {


    @Query("SELECT B FROM BusRoute B WHERE B.koreaRouteName LIKE CONCAT('%', :busStationName, '%')")
    List<BusRoute> getBusStationList(@Param("busStationName") String busStationName);

}
