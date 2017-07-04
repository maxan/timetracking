package mesoft.tool.timetracking.simple.database.query.entity;

import java.util.Date;

public class WorkedHourItemDocument {

	private Date day;
	private int ammount;
	
	public Date getDay() {
		return day;
	}
	
	public void setDay(Date day) {
		this.day = day;
	}
	
	public int getAmmount() {
		return ammount;
	}
	
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ammount;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
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
		WorkedHourItemDocument other = (WorkedHourItemDocument) obj;
		if (ammount != other.ammount)
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WorkedHourItemDocument [day=" + day + ", ammount=" + ammount + "]";
	}
	
}
