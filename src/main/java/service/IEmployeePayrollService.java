package service;

import model.Employee;

import java.util.List;

public interface IEmployeePayrollService {
    public String getMessage(String name) ;
    public String postMessage(Employee employee);
    public String putMessage(String name) ;


}
