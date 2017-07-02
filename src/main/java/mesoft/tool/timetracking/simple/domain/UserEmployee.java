package mesoft.tool.timetracking.simple.domain;

import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.spring.stereotype.Aggregate;

import mesoft.tool.timetracking.simple.domain.command.AddWorkedHourCommand;
import mesoft.tool.timetracking.simple.domain.command.CreateUserEmployeeCommand;
import mesoft.tool.timetracking.simple.domain.event.UserEmployeeCreateCompletedEvent;
import mesoft.tool.timetracking.simple.domain.event.UserEmployeeCreateFailedEvent;
import mesoft.tool.timetracking.simple.domain.event.UserEmployeeCreatedEvent;
import mesoft.tool.timetracking.simple.domain.event.ItemWorkedAddedEvent;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

import org.axonframework.commandhandling.CommandHandler;

@Aggregate
public class UserEmployee {

	@AggregateIdentifier
	private String id;
	private String realName;
	private String username;
	private Status operationStatus;
	
	@CommandHandler
	public UserEmployee(CreateUserEmployeeCommand command) {
		apply(new UserEmployeeCreatedEvent(id, command.getUsername(), command.getRealName()));
	}

	@CommandHandler
	public UserEmployee(AddWorkedHourCommand command) {
		apply(new ItemWorkedAddedEvent(command.getWorkedHourId(), command.getAmmount()));
	}
	
	@EventHandler
    public void on(UserEmployeeCreatedEvent event) throws Exception {
		id = event.getAggregateId();
		realName = event.getRealName();
		username = event.getUsername();
		operationStatus = Status.STARTED;
    }
	
	@EventHandler
    public void on(UserEmployeeCreateCompletedEvent event) {
		operationStatus = Status.COMPLETED;
    }

    @EventHandler
    public void on(UserEmployeeCreateFailedEvent event) {
    	operationStatus = Status.FAILED;
    }

	public UserEmployee() {

	}
	
	private enum Status {
        STARTED,
        FAILED,
        COMPLETED
    }

}
