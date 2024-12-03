package controller;

import dto.EmployeeDto;
import entity.employee;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.EmployeeService;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    EmployeeService epmployeeService;

    @PostMapping("/addData")
    public ResponseEntity<employee> addData(EmployeeDto employeeDto){
        return new ResponseEntity<>(epmployeeService.addData(employeeDto),CREATED);

    }



}
