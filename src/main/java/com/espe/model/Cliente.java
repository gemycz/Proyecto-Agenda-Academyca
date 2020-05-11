package com.espe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	@Column
	private String nombreCli;
	@Column
	private String apellidoCli;
	@Column
	private String CedulaCli;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCli() {
		return nombreCli;
	}

	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}

	public String getApellidoCli() {
		return apellidoCli;
	}

	public void setApellidoCli(String apellidoCli) {
		this.apellidoCli = apellidoCli;
	}

	public String getCedulaCli() {
		return CedulaCli;
	}

	public void setCedulaCli(String cedulaCli) {
		CedulaCli = cedulaCli;
	}

	@Override
	public String toString() {
		return "Cliente idCliente: " + idCliente + ", nombreCli: " + nombreCli + ", apellidoCli: " + apellidoCli
				+ ", CedulaCli: " + CedulaCli;
	}

}
