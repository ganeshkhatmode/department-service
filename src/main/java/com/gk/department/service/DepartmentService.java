package com.gk.department.service;

import com.gk.department.model.Department;

public interface DepartmentService {

	public Department save(Department department);
	
	public Department findByDepartmentId(long departmentId);
}
