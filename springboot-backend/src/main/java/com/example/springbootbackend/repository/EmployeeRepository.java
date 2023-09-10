package com.example.springbootbackend.repository;

import com.example.springbootbackend.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
