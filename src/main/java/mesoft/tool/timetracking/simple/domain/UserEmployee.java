package mesoft.tool.timetracking.simple.domain;

import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.factory.annotation.Autowired;

import mesoft.tool.timetracking.simple.database.command.repository.EmployeeRepository;
import mesoft.tool.timetracking.simple.domain.command.CreateUserEmployeeCommand;
import mesoft.tool.timetracking.simple.domain.event.UserEmployeeCompletedEvent;
import mesoft.tool.timetracking.simple.domain.event.UserEmployeeCreatedEvent;

import static org.axonframework.commandhandling.model.AggregateLifecycle.apply;

import org.axonframework.commandhandling.CommandHandler;

@Aggregate
public class UserEmployee {

	@AggregateIdentifier
	private String id;
	private String realName;
	private String username;
	private Status operationStatus;

	@SuppressWarnings("unused")
	private UserEmployee() {

	}
	
	@CommandHandler
	public UserEmployee(CreateUserEmployeeCommand command) {
		apply(new UserEmployeeCreatedEvent(command.getAggregateId(), command.getUsername(), command.getRealName()));
	}

//	@CommandHandler
//	public UserEmployee(AddWorkedHourCommand command) {
//		apply(new ItemWorkedAddedEvent(command.getWorkedHourId(), command.getAmmount()));
//	}
	
	@EventSourcingHandler
    public void on(UserEmployeeCreatedEvent event) {
		id = event.getAggregateId();
		realName = event.getRealName();
		username = event.getUsername();
		operationStatus = Status.STARTED;
    }
	
	@EventSourcingHandler
    public void on(UserEmployeeCompletedEvent event) {
		operationStatus = Status.COMPLETED;
    }
//
//	@EventSourcingHandler
//    public void on(UserEmployeeFailedEvent event) {
//    	operationStatus = Status.FAILED;
//    }
	
	private enum Status {
        STARTED,
        FAILED,
        COMPLETED
    }

}
