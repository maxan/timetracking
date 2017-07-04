package mesoft.tool.timetracking.simple.domain.event;

import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mesoft.tool.timetracking.simple.database.query.entity.EmployeeDocument;
import mesoft.tool.timetracking.simple.database.query.repository.EmployeeDocumentRepository;

@Component
public class UserEmployeeEventListener {
	
	private EmployeeDocumentRepository employeeDocumentRepository;

    @Autowired
    public UserEmployeeEventListener(EmployeeDocumentRepository employeeDocumentRepository) {
        this.employeeDocumentRepository = employeeDocumentRepository;
    }
    
    @EventHandler
    public void on(UserEmployeeCreatedEvent event) {
		EmployeeDocument newEmployee = new EmployeeDocument();

		newEmployee.setRealName(event.getRealName());
		newEmployee.setUsername(event.getUsername());

		employeeDocumentRepository.save(newEmployee);
    }

}
