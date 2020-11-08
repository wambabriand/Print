package print.security;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.google.common.collect.*;

import static print.security.Permission.*;

public enum Roles {
	
	USER( Sets.newHashSet(ONE)),
	PRINTER(Sets.newHashSet(ONE,TWO)),
	ADMIN(Sets.newHashSet(ONE,TWO,THREE));
	
	private final Set<Permission> permissions;

	private Roles(Set<Permission> permissions) {
		this.permissions = permissions;
	}

	public Set<Permission> getPermissions() {
		return this.permissions;
	}
	
	public List<SimpleGrantedAuthority> getSimpleGrantedAuthority() {	
		List<SimpleGrantedAuthority> permissions = this.permissions.stream()
					.map( p -> new SimpleGrantedAuthority(p.getPermission()) )
					.collect(Collectors.toList());
		
		permissions.add( new SimpleGrantedAuthority("ROLE_"+ this.name()));
		return permissions;
	}
	
	
	

}
