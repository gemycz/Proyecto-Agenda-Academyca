package com.jsf.entitymanager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class UserEntityManager {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_ESTUDIANTE;
	private String login;
	private String password;

	public int getId() {
		return ID_ESTUDIANTE;
	}

	public void setId(int id) {
		this.ID_ESTUDIANTE = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}