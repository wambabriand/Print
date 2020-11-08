package print.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import print.payload.ResultGeneric;

@Controller
@CrossOrigin("*")
public class AppUserController {

	
	
	public ResultGeneric createUserAccount() {
		ResultGeneric result = new ResultGeneric();
		
		return result;
	}
	
	public ResultGeneric deleteUserAccount() {
		ResultGeneric result = new ResultGeneric();
		
		return result;
	}
	
	public ResultGeneric updateUserAccount() {
		ResultGeneric result = new ResultGeneric();
		
		return result;
	}
	
	public ResultGeneric getAllUserAccounts() {
		ResultGeneric result = new ResultGeneric();
		
		return result;
	}
	
	
	
}
