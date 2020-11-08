package print.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Document {

	@GetMapping("all/home")
	public String home() {
		return "home";
	}

	@GetMapping("printer/1")
	public String printer() {
		return "printer";
	}

	@GetMapping("user/1")
	public String user() {
		return "user";
	}

	@GetMapping("admin/1")
	public String admin() {
		return "admin";
	}
	
}
