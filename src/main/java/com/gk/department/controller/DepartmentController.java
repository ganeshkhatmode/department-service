package com.gk.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gk.department.model.Department;
import com.gk.department.service.DepartmentService;

@Controller
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department save(@RequestBody Department department) {
		
		return departmentService.save(department);
	}
	
	@GetMapping("/{id}")
	public Department findByDepartmentId(@PathVariable long id) {
		
		return departmentService.findByDepartmentId(id);
	}

}
