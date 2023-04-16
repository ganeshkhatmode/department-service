package com.gk.department.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.department.model.Department;
import com.gk.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentService departmentService;
	
	public Department save(Department department) {
		
		return departmentService.save(department);
	}

	public Department findByDepartmentId(long departmentId) {
		
		return departmentService.findByDepartmentId(departmentId);
	}

}
