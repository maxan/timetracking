package mesoft.tool.timetracking.simple.domain.event;

public class UserEmployeeCreateFailedEvent {

	private final String aggregateId;

	public UserEmployeeCreateFailedEvent(String aggregateId) {
		this.aggregateId = aggregateId;
	}

	public String getAggregateId() {
		return aggregateId;
	}
	
}
