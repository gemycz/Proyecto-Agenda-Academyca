package com.espe.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tareas")
public class Tareas implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID_TAREA;
	@Column
	private String ID_ESTUDIANTE;
	@Column
	private String NRC_ASIGNATURA;
	@Column
	private Date FECHA_ENTREGA;
	@Column
	private String ESTADO_TAREA;
	@Column
	private String PRIORIDAD_TAREA;
	@Column
	private Double CALIFICACIONES_TAREA;
	@Column
	private String DESCRIPCION_TAREA;

	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "NRC_ASIGNATURA") private Asignatura asignatura;
	 */

	public Integer getID_TAREA() {
		return ID_TAREA;
	}

	public void setID_TAREA(Integer iD_TAREA) {
		ID_TAREA = iD_TAREA;
	}

	public String getID_ESTUDIANTE() {
		return ID_ESTUDIANTE;
	}

	public void setID_ESTUDIANTE(String iD_ESTUDIANTE) {
		ID_ESTUDIANTE = iD_ESTUDIANTE;
	}

	public String getNRC_ASIGNATURA() {
		return NRC_ASIGNATURA;
	}

	public String getDESCRIPCION_TAREA() {
		return DESCRIPCION_TAREA;
	}

	public void setDESCRIPCION_TAREA(String dESCRIPCION_TAREA) {
		DESCRIPCION_TAREA = dESCRIPCION_TAREA;
	}

	public void setNRC_ASIGNATURA(String nRC_ASIGNATURA) {
		NRC_ASIGNATURA = nRC_ASIGNATURA;
	}

	public Date getFECHA_ENTREGA() {
		return FECHA_ENTREGA;
	}

	public void setFECHA_ENTREGA(Date fECHA_ENTREGA) {
		FECHA_ENTREGA = fECHA_ENTREGA;
	}

	public String getESTADO_TAREA() {
		return ESTADO_TAREA;
	}

	public void setESTADO_TAREA(String eSTADO_TAREA) {
		ESTADO_TAREA = eSTADO_TAREA;
	}

	public String getPRIORIDAD_TAREA() {
		return PRIORIDAD_TAREA;
	}

	public void setPRIORIDAD_TAREA(String pRIORIDAD_TAREA) {
		PRIORIDAD_TAREA = pRIORIDAD_TAREA;
	}

	public Double getCALIFICACIONES_TAREA() {
		return CALIFICACIONES_TAREA;
	}

	public void setCALIFICACIONES_TAREA(Double cALIFICACIONES_TAREA) {
		CALIFICACIONES_TAREA = cALIFICACIONES_TAREA;
	}

	@Override
	public String toString() {
		return "Tareas [ID_TAREA=" + ID_TAREA + ", ID_ESTUDIANTE=" + ID_ESTUDIANTE + ", NRC_ASIGNATURA="
				+ NRC_ASIGNATURA + ", FECHA_ENTREGA=" + FECHA_ENTREGA + ", ESTADO_TAREA=" + ESTADO_TAREA
				+ ", PRIORIDAD_TAREA=" + PRIORIDAD_TAREA + ", CALIFICACIONES_TAREA=" + CALIFICACIONES_TAREA
				+ ", DESCRIPCION_TAREA=" + DESCRIPCION_TAREA + "]";
	}

}
