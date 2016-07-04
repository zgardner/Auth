package com.zgardner.Auth;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableResourceServer
@EnableDiscoveryClient
public class Application 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Application.class, args);
    	
    	System.out.println(System.getProperty("project.build.directory"));
    }
    
    @RequestMapping("/user")
    public Principal getUser (Principal user) {
    	return user;
    }
}
