package mesoft.tool.timetracking.simple.database.command.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "workedhour")
public class WorkedHour {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "ammount")
	private int ammount;

	@Column(name = "datework")
	private Date dateWork;
	
	@ManyToOne
	@JoinColumn(name = "employeeId")
	private Employee employee;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}

	public Date getDateWork() {
		return dateWork;
	}

	public void setDateWork(Date dateWork) {
		this.dateWork = dateWork;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ammount;
		result = prime * result + ((dateWork == null) ? 0 : dateWork.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
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
		WorkedHour other = (WorkedHour) obj;
		if (ammount != other.ammount)
			return false;
		if (dateWork == null) {
			if (other.dateWork != null)
				return false;
		} else if (!dateWork.equals(other.dateWork))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WorkedHour [id=" + id + ", ammount=" + ammount + ", dateWork=" + dateWork + ", employee=" + employee
				+ "]";
	}

}
