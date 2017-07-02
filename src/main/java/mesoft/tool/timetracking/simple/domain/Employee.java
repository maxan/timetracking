package mesoft.tool.timetracking.simple.domain;

import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

import mesoft.tool.timetracking.simple.domain.command.AddWorkedHourCommand;
import mesoft.tool.timetracking.simple.domain.command.CreateEmployeeCommand;
import mesoft.tool.timetracking.simple.domain.event.EmployeeCreatedEvent;
import mesoft.tool.timetracking.simple.domain.event.ItemWorkedAddedEvent;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

import org.axonframework.commandhandling.CommandHandler;

@Aggregate
public class Employee {

	@AggregateIdentifier
	private String id;

	@CommandHandler
	public Employee(CreateEmployeeCommand command) {
		id = command.getAggregateId();

		// TODO: state change implementation

		apply(new EmployeeCreatedEvent(id, command.getUsername(), command.getRealName()));
	}

	@CommandHandler
	public Employee(AddWorkedHourCommand command) {
		// TODO: state change implementation

		apply(new ItemWorkedAddedEvent(command.getWorkedHourId(), command.getAmmount()));
	}

	public Employee() {

	}

}
