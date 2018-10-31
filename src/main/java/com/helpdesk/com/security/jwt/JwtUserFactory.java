package com.helpdesk.com.security.jwt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.helpdesk.com.entity.User;
import com.helpdesk.com.enums.ProfileEnum;

public class JwtUserFactory {

		private JwtUserFactory(){}
		
		public static JwtUser create(User user) {
			return new JwtUser(user.getId(), user.getEmail(), user.getPassword(), mapToGrantedAuthorities(user.getProfile()));
		}
		
		private static List<GrantedAuthority> mapToGrantedAuthorities(ProfileEnum profileEnum){
			List<GrantedAuthority> authories = new ArrayList<GrantedAuthority>();
			authories.add(new SimpleGrantedAuthority(profileEnum.toString()));
			return authories;
		}
}
