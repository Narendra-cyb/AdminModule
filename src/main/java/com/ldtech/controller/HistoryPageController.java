package com.ldtech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ldtech.entity.EmployeeAllocation;
import com.ldtech.service.IHistoryService;

@RestController
@RequestMapping("/history")
public class HistoryPageController {

	@Autowired
	IHistoryService service;

	@GetMapping("/search/id/{searchTerm}")
	public List<EmployeeAllocation> searchEmployeeById(@PathVariable String searchTerm) {
		return service.searchByEmployeeId(searchTerm);
	}
	
	@GetMapping("/search/name/{searchTerm}")
	public List<EmployeeAllocation> searchEmployeeByName(@PathVariable String searchTerm) {
		System.out.println("HistoryPageController.searchEmployeeByName()"+ service.searchByEmployeeName(searchTerm));
		return service.searchByEmployeeName(searchTerm);
	}

}
