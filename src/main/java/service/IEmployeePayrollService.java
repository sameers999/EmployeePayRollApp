package service;

import dto.EmployeeDTO;
import model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeeDTO employeeDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeeDTO employeeDTO);

    void deleteEmployeePayrollData(int empId);
}
