package mesoft.tool.timetracking.simple.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCommandController {

	@RequestMapping(path = "signup", method = RequestMethod.PUT)
	public @ResponseBody String signUp() {
		return "{\"response\":\"success\"}";
	}
	
	@RequestMapping(path = "registerWork", method = RequestMethod.PUT)
	public @ResponseBody String registerWork() {
		return "{\"response\":\"success\"}";
	}
	
}
