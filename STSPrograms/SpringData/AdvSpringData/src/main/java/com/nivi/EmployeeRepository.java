package com.nivi;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer>{

	@Query("SELECT e FROM Employee e WHERE dept = ?1 AND desig = ?2")
	List<Employee> findByDeptAndDesig(String dept,String desig);
	
	
	
	
}

