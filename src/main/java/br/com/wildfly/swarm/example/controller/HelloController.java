package br.com.wildfly.swarm.example.controller;

import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.wildfly.swarm.example.domain.service.UserService;
import br.com.wildfly.swarm.example.pojo.User;

@RequestScoped
@Path("/hello")
public class HelloController {

	@Inject
	private UserService userService;
	
	private static final Logger LOGGER = Logger.getLogger(HelloController.class.getName());
	
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	public User hello() {
		LOGGER.info("Starting service UserService.get");
		return userService.get();
	}
	
}
