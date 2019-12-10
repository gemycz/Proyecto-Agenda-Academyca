package com.espe.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
//import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.primefaces.PrimeFaces;
import org.primefaces.event.SelectEvent;

@Entity
@Table(name="asignatura")

public class Asignatura {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer NRC_ASIGNATURA;
	@Column
	private String NOMBRE_ASIGNATURA;
	@Column
	private String AULA_ASIGNATURA;
	@Temporal(TemporalType.TIME)
	private Date HORAENTRADA_ASIGNATURA;
	@Temporal(TemporalType.TIME)
	private Date HORASALIDA_ASIGNATURA;
	@Column
	private Date DIAS_ASIGNATURA;
	@Column
	private String 	CALIFICACION_ASIGNATURA;
	public Integer getNRC_ASIGNATURA() {
		return NRC_ASIGNATURA;
	}
	public void setNRC_ASIGNATURA(Integer nRC_ASIGNATURA) {
		NRC_ASIGNATURA = nRC_ASIGNATURA;
	}
	public String getNOMBRE_ASIGNATURA() {
		return NOMBRE_ASIGNATURA;
	}
	public void setNOMBRE_ASIGNATURA(String nOMBRE_ASIGNATURA) {
		NOMBRE_ASIGNATURA = nOMBRE_ASIGNATURA;
	}
	public String getAULA_ASIGNATURA() {
		return AULA_ASIGNATURA;
	}
	public void setAULA_ASIGNATURA(String aULA_ASIGNATURA) {
		AULA_ASIGNATURA = aULA_ASIGNATURA;
	}
	public Date getHORAENTRADA_ASIGNATURA() {
		return HORAENTRADA_ASIGNATURA;
	}
	public void setHORAENTRADA_ASIGNATURA(Date hORAENTRADA_ASIGNATURA) {
		HORAENTRADA_ASIGNATURA = hORAENTRADA_ASIGNATURA;
	}
	public Date getHORASALIDA_ASIGNATURA() {
		return HORASALIDA_ASIGNATURA;
	}
	public void setHORASALIDA_ASIGNATURA(Date hORASALIDA_ASIGNATURA) {
		this.HORASALIDA_ASIGNATURA = hORASALIDA_ASIGNATURA;
	}
	public Date getDIAS_ASIGNATURA() {
		return DIAS_ASIGNATURA;
	}
	public void setDIAS_ASIGNATURA(Date dIAS_ASIGNATURA) {
		this.DIAS_ASIGNATURA = dIAS_ASIGNATURA;
	}
	public String getCALIFICACION_ASIGNATURA() {
		return CALIFICACION_ASIGNATURA;
	}
	public void setCALIFICACION_ASIGNATURA(String cALIFICACION_ASIGNATURA) {
		CALIFICACION_ASIGNATURA = cALIFICACION_ASIGNATURA;
	}
	@Override
	public String toString() {
		return "Asignatura [NRC_ASIGNATURA=" + NRC_ASIGNATURA + ", NOMBRE_ASIGNATURA=" + NOMBRE_ASIGNATURA
				+ ", AULA_ASIGNATURA=" + AULA_ASIGNATURA + ", HORAENTRADA_ASIGNATURA=" + HORAENTRADA_ASIGNATURA
				+ ", HORASALIDA_ASIGNATURA=" + HORASALIDA_ASIGNATURA + ", DIAS_ASIGNATURA=" + DIAS_ASIGNATURA
				+ ", CALIFICACION_ASIGNATURA=" + CALIFICACION_ASIGNATURA + "]";
	}
	
	
	
	
	
	
}
