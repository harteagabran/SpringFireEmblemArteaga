package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Unit;

/**
 * @author Halmar Arteaga - harteagabran
 * CIS175 - Spring 2024
 * Mar 3, 2024
 */
@Repository
public interface UnitRepository extends JpaRepository<Unit, Long>{
	
}
