package print.service;

import print.payload.ResultGeneric;

public interface AppUserService {
	
	public ResultGeneric createUserAccount();
	
	public ResultGeneric deleteUserAccount();
	
	public ResultGeneric updateUserAccount();
	
	public ResultGeneric getAllUserAccounts();
	

}
