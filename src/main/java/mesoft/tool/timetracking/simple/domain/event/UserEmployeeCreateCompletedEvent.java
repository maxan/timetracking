package mesoft.tool.timetracking.simple.domain.event;

public class UserEmployeeCreateCompletedEvent {
	
	private final String aggregateId;

	public UserEmployeeCreateCompletedEvent(String aggregateId) {
		this.aggregateId = aggregateId;
	}

	public String getAggregateId() {
		return aggregateId;
	}

}
