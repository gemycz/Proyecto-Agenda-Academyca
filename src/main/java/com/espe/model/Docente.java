package com.espe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="docente")
public class Docente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID_DOCENTE;
	@Column
	private String CEDULA_DOCENTE;
	@Column
	private String NOMBRE_DOCENTE;
	@Column
	private String APELLIDO_DOCENTE;
	@Column
	private String CORREO_DOCENTE;
	@Column
	private String TELEFONO_DOCENTE;
	
	
	public Integer getID_DOCENTE() {
		return ID_DOCENTE;
	}
	public void setID_DOCENTE(Integer iD_DOCENTE) {
		ID_DOCENTE = iD_DOCENTE;
	}
	public String getCEDULA_DOCENTE() {
		return CEDULA_DOCENTE;
	}
	public void setCEDULA_DOCENTE(String cEDULA_DOCENTE) {
		CEDULA_DOCENTE = cEDULA_DOCENTE;
	}
	public String getNOMBRE_DOCENTE() {
		return NOMBRE_DOCENTE;
	}
	public void setNOMBRE_DOCENTE(String nOMBRE_DOCENTE) {
		NOMBRE_DOCENTE = nOMBRE_DOCENTE;
	}
	public String getAPELLIDO_DOCENTE() {
		return APELLIDO_DOCENTE;
	}
	public void setAPELLIDO_DOCENTE(String aPELLIDO_DOCENTE) {
		APELLIDO_DOCENTE = aPELLIDO_DOCENTE;
	}
	public String getCORREO_DOCENTE() {
		return CORREO_DOCENTE;
	}
	public void setCORREO_DOCENTE(String cORREO_DOCENTE) {
		CORREO_DOCENTE = cORREO_DOCENTE;
	}
	public String getTELEFONO_DOCENTE() {
		return TELEFONO_DOCENTE;
	}
	public void setTELEFONO_DOCENTE(String tELEFONO_DOCENTE) {
		TELEFONO_DOCENTE = tELEFONO_DOCENTE;
	}
	@Override
	public String toString() {
		return "Docente [ID_DOCENTE=" + ID_DOCENTE + ", CEDULA_DOCENTE=" + CEDULA_DOCENTE + ", NOMBRE_DOCENTE="
				+ NOMBRE_DOCENTE + ", APELLIDO_DOCENTE=" + APELLIDO_DOCENTE + ", CORREO_DOCENTE=" + CORREO_DOCENTE
				+ ", TELEFONO_DOCENTE=" + TELEFONO_DOCENTE + "]";
	}
	
	
	

}
