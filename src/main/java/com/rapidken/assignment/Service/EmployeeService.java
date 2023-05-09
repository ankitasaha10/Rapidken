package com.rapidken.assignment.Service;

import com.rapidken.assignment.Model.Employee;
import com.rapidken.assignment.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public String add(Employee employee){
        employeeRepository.save(employee);
        return "Employee's details added successfully";
    }

    public List<Employee> getByDepartment( String department){
        return employeeRepository.findByDepartment(department);
    }

    public List<Employee> getByPosition( String position){
        return employeeRepository.findByPosition(position);
    }

    public String deleteById(Long id){
        employeeRepository.deleteById(id);
        return "Id deleted successfully";
    }
}
