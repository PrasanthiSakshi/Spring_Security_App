package in.sakshi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/logincheck")
	public String login() {
		return "Login Page loading...";
	}
	
	@GetMapping("/contact")
	public String Contact() {
		return "call us:: +91 99 88 77 66 55";
	}
	
	@GetMapping("/hi")
	public String SayHi() {
		return "Hi,How are you";
	}
	
	@GetMapping("/hello")
	public String SayHello() {
		return "Hello,How are you";
	}

}
