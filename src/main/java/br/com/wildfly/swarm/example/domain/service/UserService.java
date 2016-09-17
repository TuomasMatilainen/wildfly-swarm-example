package br.com.wildfly.swarm.example.domain.service;

import java.util.logging.Logger;

import javax.ejb.Stateless;

import br.com.wildfly.swarm.example.pojo.User;

@Stateless
public class UserService {
	
	private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());
	
	public User get() {
		LOGGER.info("Generating user");
		return new User("Rafael", "rtroquete");
	}

}
