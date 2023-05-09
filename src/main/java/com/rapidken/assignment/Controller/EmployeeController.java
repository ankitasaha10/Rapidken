package com.rapidken.assignment.Controller;


import com.rapidken.assignment.Model.Employee;
import com.rapidken.assignment.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("")
    public String add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @GetMapping("/department")
    public List<Employee> getByDepartment(@RequestParam("name") String department){
            return employeeService.getByDepartment(department);
    }

    @GetMapping("/position")
    public List<Employee>  getByPosition(@RequestParam("name") String position){
            return employeeService.getByPosition(position);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id){
        return employeeService.deleteById(id);
    }

    @GetMapping("/pagination")
    public Page<Employee> findPage(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        return employeeService.findPage(page, size);
    }
}
