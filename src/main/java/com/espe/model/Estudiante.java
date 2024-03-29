package com.espe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer ID_ESTUDIANTE;
	@Column
	private String CEDULA_ESTUDIANTE;
	@Column
	private String NOMBRE_ESTUDIANTE;
	@Column
	private String APELLIDO_ESTUDIANTE;
	@Column
	private String USUARIO_ESTUDIANTE;
	@Column
	private int NIVEL_ESTUDIANTE;
	@Column
	private String login;
	@Column
	private String password;

	public Integer getID_ESTUDIANTE() {
		return ID_ESTUDIANTE;
	}

	public void setID_ESTUDIANTE(Integer ID_ESTUDIANTE) {
		this.ID_ESTUDIANTE = ID_ESTUDIANTE;
	}

	public String getCEDULA_ESTUDIANTE() {
		return CEDULA_ESTUDIANTE;
	}

	public void setCEDULA_ESTUDIANTE(String CEDULA_ESTUDIANTE) {
		this.CEDULA_ESTUDIANTE = CEDULA_ESTUDIANTE;
	}

	public String getNOMBRE_ESTUDIANTE() {
		return NOMBRE_ESTUDIANTE;
	}

	public void setNOMBRE_ESTUDIANTE(String NOMBRE_ESTUDIANTE) {
		this.NOMBRE_ESTUDIANTE = NOMBRE_ESTUDIANTE;
	}

	public String getAPELLIDO_ESTUDIANTE() {
		return APELLIDO_ESTUDIANTE;
	}

	public void setAPELLIDO_ESTUDIANTE(String APELLIDO_ESTUDIANTE) {
		this.APELLIDO_ESTUDIANTE = APELLIDO_ESTUDIANTE;
	}

	public int getNIVEL_ESTUDIANTE() {
		return NIVEL_ESTUDIANTE;
	}

	public void setNIVEL_ESTUDIANTE(int NIVEL_ESTUDIANTE) {
		this.NIVEL_ESTUDIANTE = NIVEL_ESTUDIANTE;
	}

	public String getUSUARIO_ESTUDIANTE() {
		return USUARIO_ESTUDIANTE;
	}

	public void setUSUARIO_ESTUDIANTE(String uSUARIO_ESTUDIANTE) {
		USUARIO_ESTUDIANTE = uSUARIO_ESTUDIANTE;
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

	@Override
	public String toString() {
		return "Estudiante [ID_ESTUDIANTE=" + ID_ESTUDIANTE + ", CEDULA_ESTUDIANTE=" + CEDULA_ESTUDIANTE
				+ ", NOMBRE_ESTUDIANTE=" + NOMBRE_ESTUDIANTE + ", APELLIDO_ESTUDIANTE=" + APELLIDO_ESTUDIANTE
				+ ", NIVEL_ESTUDIANTE=" + NIVEL_ESTUDIANTE + ", login=" + login + ", password=" + password + "]";
	}

}
