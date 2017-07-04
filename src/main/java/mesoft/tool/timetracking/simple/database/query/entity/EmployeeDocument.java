package mesoft.tool.timetracking.simple.database.query.entity;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@CompoundIndexes({
	@CompoundIndex(name = "employee_username", def = "{ 'username' : 1 }", unique = true)
})
@Document(collection = "employee")
public class EmployeeDocument {
	
	@Id
	private int id;
	private String username;
	private String realName;
	private List<WorkedHourItemDocument> registeredWork;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public List<WorkedHourItemDocument> getRegisteredWork() {
		return registeredWork;
	}

	public void setRegisteredWork(List<WorkedHourItemDocument> registeredWork) {
		this.registeredWork = registeredWork;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((realName == null) ? 0 : realName.hashCode());
		result = prime * result + ((registeredWork == null) ? 0 : registeredWork.hashCode());
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
		EmployeeDocument other = (EmployeeDocument) obj;
		if (id != other.id)
			return false;
		if (realName == null) {
			if (other.realName != null)
				return false;
		} else if (!realName.equals(other.realName))
			return false;
		if (registeredWork == null) {
			if (other.registeredWork != null)
				return false;
		} else if (!registeredWork.equals(other.registeredWork))
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
		return "EmployeeDocument [id=" + id + ", username=" + username + ", realName=" + realName + "]";
	}

}
