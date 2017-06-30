package mesoft.tool.timetracking.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class SimpleApplication {
	
	@RequestMapping("/")
	public String home() {
		return "Welcome to Time Tracking!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleApplication.class, args);
	}
}
