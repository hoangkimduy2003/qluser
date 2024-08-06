package com.qluser.service;

import com.qluser.domain.Employee;
import com.qluser.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = employeeRepository;
    }

    public Employee getEmployeeById(long employeeId) {
        Employee obj = employeeRepository.findById(employeeId).orElse(null);

        return obj;
    }

    public void AddEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(long employeeId) {
        employeeRepository.deleteById(employeeId);
    }
}
