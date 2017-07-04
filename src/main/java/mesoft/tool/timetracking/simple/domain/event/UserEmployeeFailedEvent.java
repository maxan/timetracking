package mesoft.tool.timetracking.simple.domain.event;

public class UserEmployeeFailedEvent {

	private final String aggregateId;

	public UserEmployeeFailedEvent(String aggregateId) {
		this.aggregateId = aggregateId;
	}

	public String getAggregateId() {
		return aggregateId;
	}
	
}
