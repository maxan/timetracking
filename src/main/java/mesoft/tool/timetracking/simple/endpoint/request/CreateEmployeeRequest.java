package mesoft.tool.timetracking.simple.endpoint.request;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateEmployeeRequest {

	@NotNull
	@Size(min = 3, max = 200)
	private String realName;
	
	@NotNull
	@Size(min = 3, max = 50)
	private String username;

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		CreateEmployeeRequest other = (CreateEmployeeRequest) obj;
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
		return "CreateEmployeeRequest [realName=" + realName + ", username=" + username + "]";
	}
	
}