package mesoft.tool.timetracking.simple.domain.command;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventhandling.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mesoft.tool.timetracking.simple.database.command.repository.EmployeeRepository;
import mesoft.tool.timetracking.simple.domain.event.UserEmployeeCreatedEvent;

import static org.axonframework.eventhandling.GenericEventMessage.asEventMessage;

@Component
public class UserEmployeeCommandHandler {

	private EmployeeRepository employeeRepository;
	private EventBus eventBus;

    @Autowired
    public UserEmployeeCommandHandler(EmployeeRepository employeeRepository, EventBus eventBus) {
        this.employeeRepository = employeeRepository;
        this.eventBus = eventBus;
    }
    
    @CommandHandler
	public void handler(CreateUserEmployeeCommand command) {
    	eventBus.publish(asEventMessage(new UserEmployeeCreatedEvent(command.getAggregateId(), command.getUsername(), command.getRealName())));
	}
	
}
