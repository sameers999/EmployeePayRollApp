package model;

import dto.EmployeePayrollDTO;
import lombok.Data;

public @Data class EmployeePayrollData {
    private int employeeId;
    private String name;
    private long salary;

    public  EmployeePayrollData() {

    }

    public EmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        this.employeeId = empId;
        this.name = empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
    }
}
