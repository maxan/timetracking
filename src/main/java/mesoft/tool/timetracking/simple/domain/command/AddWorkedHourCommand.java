package mesoft.tool.timetracking.simple.domain.command;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

public class AddWorkedHourCommand {
	
	@TargetAggregateIdentifier
	private final String workedHourId;
	private final int ammount;
	
	private AddWorkedHourCommand(String id, int ammount) {
		this.workedHourId = id;
		this.ammount = ammount;
	}

	public String getWorkedHourId() {
		return workedHourId;
	}

	public int getAmmount() {
		return ammount;
	}

}
