package service;

import model.Employee;

import java.util.List;

public interface IEmployeePayrollService {
    public String getMessage(String name) ;
    public String postMessage(Employee employee);
    public String putMessage(String name) ;
    public String getWelcome();
    public Employee postDataToRepo(Employee employee);
    public List<Employee> getAllData();
    public Employee getDataById(Integer id);
    public Employee updateDataById(Integer id,Employee employee);
    public String deleteDataById(Integer id);


}
