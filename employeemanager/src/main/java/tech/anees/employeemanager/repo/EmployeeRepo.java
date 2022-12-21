package tech.anees.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.anees.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

	void deleteEmployeeById(Long id);

	Employee findEmployeeById(Long id);  

}
