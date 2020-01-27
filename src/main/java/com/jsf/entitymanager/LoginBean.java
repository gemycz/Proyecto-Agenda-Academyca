package com.jsf.entitymanager;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

@ManagedBean @SessionScoped
public class LoginBean {

	
	private String password;
	private String userName;
	private static final String PERSISTENCE_UNIT_NAME = "PERSISTENCE";

	public LoginBean() {}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	/* Method To Check User's Authentication Credentials */
	public String validateLoginCredentials() {
		String validationResult = "";
		EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
		Query queryObj = entityMgrObj.createQuery("SELECT u FROM UserEntityManager u WHERE u.login = :login AND u.password = :password");
		queryObj.setParameter("login", userName);
		queryObj.setParameter("password", password);
		try {
			UserEntityManager userResultSetObj = (UserEntityManager) queryObj.getSingleResult();				
			if ((userResultSetObj != null) && (userName.equalsIgnoreCase(userResultSetObj.getLogin()) && password.equals(userResultSetObj.getPassword()))) {
				validationResult ="index.xhtml";
				
			} 
		} catch(Exception exObj) {
			validationResult = "login";
			FacesContext.getCurrentInstance().addMessage("loginForm:loginName", new FacesMessage("Usuario o Contraseña es Incorrecta"));			
		}
		return validationResult;
	}
}