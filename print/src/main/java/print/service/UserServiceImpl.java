package print.service;
import print.entity.AppUser;
import static print.security.Roles.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private List<AppUser> getUsers(){
		List<AppUser> users = Lists.newArrayList(
				 new AppUser("admin","briand wamba",passwordEncoder.encode("admin"), ADMIN.getSimpleGrantedAuthority() ),
				 new AppUser("user","briand wamba",passwordEncoder.encode("user"), USER.getSimpleGrantedAuthority() )
				);
		return users;
	}
	
	
	@Override
	public AppUser getUserByEmail(String email) {
		
		Optional<AppUser> user =  getUsers().stream().filter(u->u.getEmail().equals(email))
				.findFirst();

		System.out.println( "je suis ici dans ricerca user " );
		System.out.println( user.isPresent() );
		
		if(user.isEmpty()) return null;
		return user.get();
	}

}
