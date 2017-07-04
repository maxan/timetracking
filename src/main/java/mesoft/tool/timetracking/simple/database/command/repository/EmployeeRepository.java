package mesoft.tool.timetracking.simple.database.command.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mesoft.tool.timetracking.simple.database.command.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	
	Employee findByUsername(String username);
	
}
