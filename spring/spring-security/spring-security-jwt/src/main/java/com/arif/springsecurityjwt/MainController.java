package com.arif.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.arif.springsecurityjwt.models.AuthenticationRequest;
import com.arif.springsecurityjwt.services.UserDetailsServiceImpl;
import com.arif.springsecurityjwt.util.JwtUtil;

@Controller
@ResponseBody
public class MainController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private UserDetailsServiceImpl userDetailsServiceImpl;
	

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello beautiful people";
	}
	
	
	@RequestMapping(value = "/authenticate/user", method = RequestMethod.POST)
	public ResponseEntity<?> authenticateUser(@RequestBody AuthenticationRequest authenticationRequest)
	throws Exception {
		try {
			authenticationManager.authenticate(
						new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
					);
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect username or password", e);
		}
		
		final UserDetails userDetails = userDetailsServiceImpl.loadUserByUsername(authenticationRequest.getUsername());
		final String jwtToken = jwtUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(null);
	}
	
}
