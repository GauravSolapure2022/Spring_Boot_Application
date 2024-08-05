package in.com.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	private Logger logger = LoggerFactory.getLogger(WelcomeRestController.class);

	public WelcomeRestController() {
		logger.info("***** WelcomeRestController :: Constructor *****");
	}

	@GetMapping
	public String welcomeMsg() {
		logger.info("***** welcomeMsg() execution start *****");
		String msg = "Welcome to Codetech Carporate training and placement center Pune ..!!";
		logger.info("***** welcomeMsg() execution end *****");
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg() {
		logger.info("***** greetMsg() execution start *****");
		String msg = "Good Morning, Welcome to Codetech";
		logger.info("***** greetMsg() execution end *****");
		return msg;
	}
}
