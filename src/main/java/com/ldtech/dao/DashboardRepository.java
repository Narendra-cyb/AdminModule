package com.ldtech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ldtech.entity.EmployeeAllocation;
import java.util.List;

public interface DashboardRepository extends JpaRepository<EmployeeAllocation, Long>{
	@Query("SELECT e FROM EmployeeAllocation e WHERE e.employeeId LIKE :idPattern")
    List<EmployeeAllocation> findByEmployeeIdLike(@Param("idPattern") String idPattern);
	List<EmployeeAllocation> findAllByEmployeeId(String employeeId);
	List<EmployeeAllocation> findAllByEmployeeName(String employeeName);
	List<EmployeeAllocation> findAllByDepartment(String department);
	List<EmployeeAllocation> findAllByProjectProjectName(String project);
	List<EmployeeAllocation> findAllByProjectClient(String client);
	List<EmployeeAllocation> findAllByProjectManager(String manager);
	List<EmployeeAllocation> findAllByStatus(String status);
	EmployeeAllocation findByEmployeeId(String employeeId);
	@Query(value="select count(*) from employee_allocation where status='active'",nativeQuery=true)
	Long findAllocatedEmployee();
	@Query(value="select count(*) from employee_allocation where status='inactive'",nativeQuery=true)
	Long findUnAllocatedEmployee();
}