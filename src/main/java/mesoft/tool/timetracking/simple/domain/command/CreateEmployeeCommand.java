package mesoft.tool.timetracking.simple.domain.command;

public class CreateEmployeeCommand {

	private final String id;
	private final String realName;
	private final String userName;
	
	public CreateEmployeeCommand(String id, String realName, String userName) {
		this.id = id;
		this.realName = realName;
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public String getId() {
		return id;
	}
	
}
