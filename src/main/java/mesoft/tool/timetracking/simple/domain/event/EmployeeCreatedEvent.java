package mesoft.tool.timetracking.simple.domain.event;

public class EmployeeCreatedEvent {

	private final String id;
	private final String userName;
	private final String realName;

	public EmployeeCreatedEvent(String id, String userName, String realName) {
		this.id = id;
		this.userName = userName;
		this.realName = realName;
	}

	public String getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public String getRealName() {
		return realName;
	}

}