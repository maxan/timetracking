package mesoft.tool.timetracking.simple.domain.event;

public class ItemWorkedAddedEvent {

	private final String workedHourId;
	private final int ammount;

	public ItemWorkedAddedEvent(String workedHourId, int ammount) {
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
