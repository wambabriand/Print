package print.service;

import print.entity.AppUser;


public interface UserService {

	public AppUser getUserByEmail(String email);
	
}
