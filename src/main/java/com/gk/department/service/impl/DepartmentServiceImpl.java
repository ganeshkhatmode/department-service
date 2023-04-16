package com.gk.department.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.department.model.Department;
import com.gk.department.repository.DepartmentRepository;
import com.gk.department.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department save(Department department) {
		
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(long departmentId) {
		
		return departmentRepository.findById(departmentId).get();
	}

}
