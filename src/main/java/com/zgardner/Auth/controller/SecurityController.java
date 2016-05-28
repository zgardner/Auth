package com.zgardner.Auth.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class SecurityController {
	
	@RequestMapping(value="/name", method=RequestMethod.GET)
	public String getName (Principal principal) {
		return principal.getName();
	}
}
