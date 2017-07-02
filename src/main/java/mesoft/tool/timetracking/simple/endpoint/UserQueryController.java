package mesoft.tool.timetracking.simple.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mesoft.tool.timetracking.simple.database.command.entity.Employee;
import mesoft.tool.timetracking.simple.database.command.repository.EmployeeRepository;

@RestController
public class UserQueryController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@RequestMapping("users")
	public @ResponseBody String getUsers() {
		// TODO: Change this later because it's only a test.
		// Normalized database: HSQLDB
		// Unormalized dabatase: MongoDB
		
		StringBuilder listReturned = new StringBuilder("{\"users\" : [");
		
		for (Employee employee : employeeRepository.findAll()) {
			listReturned.append("{\"realName\" : \"" + employee.getRealName() + "\", \"username\" : \"" + employee.getUsername() + "\"},");
		}
		
		listReturned.append("]}");
		
		return listReturned.toString().replace(",]}", "]}");
	}
	
	@RequestMapping("login")
	public @ResponseBody String signIn() {
		return "{\"response\":\"success\"}";
	}
	
}
