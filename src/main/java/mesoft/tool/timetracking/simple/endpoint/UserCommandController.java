package mesoft.tool.timetracking.simple.endpoint;

import java.util.UUID;

import javax.validation.Valid;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import mesoft.tool.timetracking.simple.domain.command.CreateUserEmployeeCommand;
import mesoft.tool.timetracking.simple.endpoint.request.CreateEmployeeRequest;

@RestController
public class UserCommandController {
	
	private final CommandGateway commandGateway;
	
	@Autowired
	public UserCommandController (CommandGateway commandGateway) {
		this.commandGateway = commandGateway;
	}

	@RequestMapping(path = "signup", method = RequestMethod.PUT)
	public @ResponseBody String signUp(@RequestBody @Valid CreateEmployeeRequest request) {
		String aggregateId = UUID.randomUUID().toString();
		
		commandGateway.send(new CreateUserEmployeeCommand(aggregateId, request.getRealName(), request.getUsername()));
		
		return "{\"response\":\"request done\"}";
	}
	
	@RequestMapping(path = "registerWork", method = RequestMethod.PUT)
	public @ResponseBody String registerWork() {
		return "{\"response\":\"request done\"}";
	}
	
}
