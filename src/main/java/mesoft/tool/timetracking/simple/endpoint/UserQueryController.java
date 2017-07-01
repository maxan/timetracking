package mesoft.tool.timetracking.simple.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserQueryController {

	@RequestMapping("users")
	public @ResponseBody String getUsers() {
		return "{\"users\":[{\"firstname\":\"Anderson\", \"lastname\":\"Silva\"}," +
		           "{\"firstname\":\"Berta\",\"lastname\":\"Maria\"}]}";
	}
	
	@RequestMapping("login")
	public @ResponseBody String signIn() {
		return "{\"response\":\"success\"}";
	}
	
}
