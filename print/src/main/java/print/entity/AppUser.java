package print.entity;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class AppUser implements UserDetails{
	
	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String email;
	private String name;
	private String password;
	private boolean isAccountNonLocked;
	private boolean isAccountNonExpired;
	private boolean isCredentialsNonExpired;
	private boolean isEnabled;
	private List<? extends GrantedAuthority> grantedAuthorities;
	
	
	
	public AppUser(String email, String name, String password, List<? extends GrantedAuthority> grantedAuthorities) {
		this.email = email;
		this.name = name;
		this.password = password;
		this.grantedAuthorities = grantedAuthorities;

		this.isAccountNonLocked = true;
		this.isAccountNonExpired = true;
		this.isCredentialsNonExpired = true;
		this.isEnabled = true;
	}

	public Long getId() {
		return Id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<? extends GrantedAuthority> getGrantedAuthorities () {
		return this.grantedAuthorities;
	}

	public void setGrantedAuthorities(List<? extends GrantedAuthority> grantedAuthorities ) {
		this.grantedAuthorities = grantedAuthorities;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return grantedAuthorities;
	}
	
	public String getName() {
		return name;
	}
	
	
	@Override
	public String getPassword() {
		return password;
	}
	
	@Override
	public String getUsername() {
		return email;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}
	
	@Override
	public boolean isEnabled() {
		return isEnabled;
	}
	
	

}
