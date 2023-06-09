package com.rapidken.assignment.Repository;

import com.rapidken.assignment.Model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

    public interface EmployeeRepository extends JpaRepository<Employee, Long> {
       List<Employee> findByDepartment(String department);
      List<Employee> findByPosition(String position);

    }

