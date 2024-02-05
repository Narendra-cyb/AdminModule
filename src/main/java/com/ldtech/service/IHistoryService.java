package com.ldtech.service;

import java.util.List;

import com.ldtech.entity.EmployeeAllocation;

public interface IHistoryService {
//	 List<EmployeeAllocation> searchByEmployeeIdOrName(String searchTerm);
	List<EmployeeAllocation> searchByEmployeeId(String searchTerm);

	List<EmployeeAllocation> searchByEmployeeName(String searchTerm);
}
