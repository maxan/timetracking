package mesoft.tool.timetracking.simple;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import mesoft.tool.timetracking.simple.configuration.DatabaseConfiguration;

@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { DatabaseConfiguration.class })
@TestPropertySource(locations = "file:src/test/resources/application-test.properties")
public abstract class AbstractSpringUnitTest {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	protected ApplicationContext getApplicationContext() {
		return applicationContext;
	}

}
