package mesoft.tool.timetracking.simple.command;

public class AddWorkedHourCommand {
	
	private final String workedHourId;
	private final int ammount;
	
	private AddWorkedHourCommand(String workedHourId, int ammount) {
		this.workedHourId = workedHourId;
		this.ammount = ammount;
	}

	public String getWorkedHourId() {
		return workedHourId;
	}

	public int getAmmount() {
		return ammount;
	}

}
