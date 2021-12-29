package com.fis.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fis.model.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService {
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Collection<GrantedAuthority> authorities=new ArrayList<>();
		SimpleGrantedAuthority auth= new SimpleGrantedAuthority("ROLE_ADMIN");
		 authorities.add(auth);
		return new MyUserDetails("samidi","tiger",authorities);
	}
	

}
