package mesoft.tool.timetracking.simple.domain.command;

public class CreateEmployeeCommand {

	private final String aggregateId;
	private final String realName;
	private final String username;

	public CreateEmployeeCommand(String id, String realName, String userName) {
		this.aggregateId = id;
		this.realName = realName;
		this.username = userName;
	}

	public String getAggregateId() {
		return aggregateId;
	}

	public String getUsername() {
		return username;
	}

	public String getRealName() {
		return realName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aggregateId == null) ? 0 : aggregateId.hashCode());
		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CreateEmployeeCommand other = (CreateEmployeeCommand) obj;
		if (aggregateId == null) {
			if (other.aggregateId != null)
				return false;
		} else if (!aggregateId.equals(other.aggregateId))
			return false;
		if (realName == null) {
			if (other.realName != null)
				return false;
		} else if (!realName.equals(other.realName))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CreateEmployeeCommand [aggregateId=" + aggregateId + ", realName=" + realName + ", username=" + username
				+ "]";
	}

}
