package mesoft.tool.timetracking.simple.endpoint;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserCommandController {
	
	private final CommandGateway commandGateway;
	
	@Autowired
	public UserCommandController (CommandGateway commandGateway) {
		this.commandGateway = commandGateway;
	}

	@RequestMapping(path = "signup", method = RequestMethod.PUT)
	public @ResponseBody String signUp() {
		return "{\"response\":\"success\"}";
	}
	
	@RequestMapping(path = "registerWork", method = RequestMethod.PUT)
	public @ResponseBody String registerWork() {
		return "{\"response\":\"success\"}";
	}
	
}
