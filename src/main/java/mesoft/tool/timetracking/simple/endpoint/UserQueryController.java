package mesoft.tool.timetracking.simple.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mesoft.tool.timetracking.simple.database.query.entity.EmployeeDocument;
import mesoft.tool.timetracking.simple.database.query.repository.EmployeeDocumentRepository;

@RestController
public class UserQueryController {
	
	// Normalized database: HSQLDB
	// Unormalized dabatase: MongoDB
	
	private EmployeeDocumentRepository employeeDocumentRepository;
	
	@Autowired
	public UserQueryController(EmployeeDocumentRepository employeeDocumentRepository) {
		this.employeeDocumentRepository = employeeDocumentRepository;
	}

	@RequestMapping("users")
	public @ResponseBody String getUsers() {
		StringBuilder listReturned = new StringBuilder("{\"users\" : [");
		
		for (EmployeeDocument employee : employeeDocumentRepository.findAll()) {
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
