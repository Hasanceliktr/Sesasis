package org.hasanceliktr.sesasis.repository;

import org.hasanceliktr.sesasis.entity.TrafoCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafoCenterRepository extends JpaRepository<TrafoCenter, Long> {
}
