package repository;

import model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayrollRepository extends JpaRepository <EmployeePayrollData, Integer> {
}
