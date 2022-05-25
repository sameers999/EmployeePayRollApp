package dto;

public class EmployeePayrollDTO {
    private int employeeId;
    public String name;
    public long salary;

    public EmployeePayrollDTO(int employeeId, String name, long salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
}