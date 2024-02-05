package com.ldtech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ldtech.entity.EmployeeAllocation;

//history repository using Employee Allocation Table 
public interface HistoryRepo extends JpaRepository<EmployeeAllocation, Long> {

//	List<EmployeeAllocation> findByEmployeeIdOrEmployeeNameContainingIgnoreCase(String searchTerm, String searchTerm2);
	
	   List<EmployeeAllocation> findByEmployeeIdContainingIgnoreCase(String searchTerm);
	   List<EmployeeAllocation> findByEmployeeNameContainingIgnoreCase(String searchTerm);
	

    // Define custom queries if needed
}
