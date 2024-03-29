package com.gk.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gk.department.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
