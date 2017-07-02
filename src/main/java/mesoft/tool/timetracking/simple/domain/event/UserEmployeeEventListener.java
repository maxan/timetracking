package mesoft.tool.timetracking.simple.domain.event;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mesoft.tool.timetracking.simple.database.command.entity.Employee;
import mesoft.tool.timetracking.simple.database.command.repository.EmployeeRepository;

@Component
public class UserEmployeeEventListener {

	private EmployeeRepository employeeRepository;

	@Autowired
	public UserEmployeeEventListener(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@EventHandler
	public void on(UserEmployeeCreatedEvent event) {
		Employee newEmployee = new Employee();
		
		newEmployee.setRealName(event.getRealName());
		newEmployee.setUsername(event.getUsername());
		
		employeeRepository.save(newEmployee);
		
		//employeeRepository.findAll();
		
		System.out.println("Employee information saved successfully!");
	}

	@EventHandler
	public void on(UserEmployeeCreateFailedEvent event) {
		System.out.println("Save event fail...");
	}

	@EventHandler
	public void on(UserEmployeeCreateCompletedEvent event) {
		System.out.println("Save event completed...");
	}

}
