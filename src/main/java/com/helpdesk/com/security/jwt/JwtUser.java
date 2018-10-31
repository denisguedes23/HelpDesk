package com.helpdesk.com.security.jwt;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class JwtUser implements UserDetails, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8112316029428897847L;
	
	private final String id	;
	private final String username;
	private final String password;
	private final Collection<? extends GrantedAuthority> authories;
	
	public JwtUser(String id, String username, String password, Collection<? extends GrantedAuthority> authories) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.authories = authories;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authories;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getUsername() {
		return username;
	}
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return false;
	}
}
