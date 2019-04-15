package com.SpringbootDemo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringbootDemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
