package org.hasanceliktr.sesasis.repository;

import org.hasanceliktr.sesasis.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AreaRepository extends JpaRepository<Area, Long> {

    //HQL
    @Query("SELECT r FROM Area r JOIN FETCH r.trafocenters WHERE r.id = :id")
    Area findAreaTrafoCenter(Long id);

    @Query(value = "SELECT COUNT(*) FROM TrafoCenter WHERE area_id = :areaId", nativeQuery = true)
    int countTrafoCentersByArea(Long areaId);

}
