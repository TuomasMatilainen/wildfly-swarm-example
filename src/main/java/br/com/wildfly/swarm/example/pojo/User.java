package br.com.wildfly.swarm.example.pojo;

public class User {
	
	private String name;
	private String login;
	
	public User(String name, String login) {
		this.name = name;
		this.login = login;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

}
