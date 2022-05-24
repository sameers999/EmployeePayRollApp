package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.IEmployeePayrollService;

import java.util.List;

@RestController
public class EmployeePayrollController {
    @Autowired
    IEmployeePayrollService service;
    @GetMapping("/getMessage")
    public ResponseEntity<String> getMessage(@RequestParam String name){
        return new ResponseEntity<String>(service.getMessage(name), HttpStatus.OK);
    }
    @PostMapping("/postMessage")
    public ResponseEntity<String> postMessage(@RequestBody Employee employee){
        return new ResponseEntity<String>(service.postMessage(employee),HttpStatus.OK);
    }
    @PutMapping("/putMessage/{name}")
    public ResponseEntity<String> putMessage(@PathVariable String name){
        return new ResponseEntity<String>(service.putMessage(name),HttpStatus.OK);
    }

}
