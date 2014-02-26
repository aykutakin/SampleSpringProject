package com.mydomain.model;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 
 * User will be supplied from this class.
 * User class implements Spring-Security UserDetails interface for custom authentication feature
 * 
 * @author aakin
 * 
 */
public class User implements UserDetails {
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;

	/* Spring Security fields*/
	private List<Role> authorities;
	private boolean accountNonExpired = true;
	private boolean accountNonLocked = true;
	private boolean credentialsNonExpired = true;
	private boolean enabled = true;

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.authorities;
	}
	
	public void setAuthorities(List<Role> authorities) {
		this.authorities = authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return this.accountNonExpired;
	}
	
	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return this.accountNonLocked;
	}
	
	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return this.credentialsNonExpired;
	}
	
	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [username=");
		builder.append(username);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", authorities=");
		builder.append(authorities);
		builder.append(", accountNonExpired=");
		builder.append(accountNonExpired);
		builder.append(", accountNonLocked=");
		builder.append(accountNonLocked);
		builder.append(", credentialsNonExpired=");
		builder.append(credentialsNonExpired);
		builder.append(", enabled=");
		builder.append(enabled);
		builder.append("]");
		return builder.toString();
	}

}
