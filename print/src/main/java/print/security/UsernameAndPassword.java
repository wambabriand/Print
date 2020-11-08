package print.security;

import java.io.Serializable;


public class UsernameAndPassword implements Serializable{

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	public UsernameAndPassword() {
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UsernameAndPassword [username=" + username + ", password=" + password + "]";
	}
	
	
	
}
