package mesoft.tool.timetracking.simple.domain;

import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateRoot;

import mesoft.tool.timetracking.simple.command.AddWorkedHourCommand;
import mesoft.tool.timetracking.simple.command.CreateEmployeeCommand;
import mesoft.tool.timetracking.simple.domain.event.EmployeeCreatedEvent;
import mesoft.tool.timetracking.simple.domain.event.ItemWorkedAddedEvent;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

import org.axonframework.commandhandling.CommandHandler;

@AggregateRoot
public class Employee {

	@AggregateIdentifier
	private String id;
	
	@CommandHandler
	public Employee(CreateEmployeeCommand command) {
		// TODO: state change implementation
		
		apply(new EmployeeCreatedEvent(command.getId(), command.getUserName(), command.getRealName()));
	}
	
	@CommandHandler
	public Employee(AddWorkedHourCommand command) {
		// TODO: state change implementation
		
		apply(new ItemWorkedAddedEvent(command.getWorkedHourId(), command.getAmmount()));
	}
	
	public Employee() {
		
	}
	
}
