package com.everis.training.jsfee8.beans;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named(value="user")
@ViewScoped
public class User implements Serializable{

	private static final long serialVersionUID = 4461609917324950487L;

	private String name;
	private String password;
	
	private String greeting = "PRUEBA";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
}
