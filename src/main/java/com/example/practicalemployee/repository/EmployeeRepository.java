package com.example.practicalemployee.repository;

import com.example.practicalemployee.jpa.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
