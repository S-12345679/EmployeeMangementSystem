package service;

import dto.EmployeeDto;
import entity.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public employee addData(EmployeeDto employeeDto){

    }
}
