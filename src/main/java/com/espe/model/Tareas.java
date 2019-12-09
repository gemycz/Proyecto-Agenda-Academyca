package com.espe.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tareas")
public class Tareas {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer ID_TAREA;
	@Column
	private String ID_ESTUDIANTE;
	@Column
	private String NRC_ASIGNATURA;
	@Column
	private Date FECHA_ENTREGA;
	@Column
	private boolean ESTADO_TAREA;
	@Column
	private String PRIORIDAD_TAREA;
	@Column
	private String CALIFICACIONES_TAREA;
	@Column
	private String DESCRIPCION_TAREA;
	
	
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
	public boolean isESTADO_TAREA() {
		return ESTADO_TAREA;
	}
	public void setESTADO_TAREA(boolean eSTADO_TAREA) {
		ESTADO_TAREA = eSTADO_TAREA;
	}
	public String getPRIORIDAD_TAREA() {
		return PRIORIDAD_TAREA;
	}
	public void setPRIORIDAD_TAREA(String pRIORIDAD_TAREA) {
		PRIORIDAD_TAREA = pRIORIDAD_TAREA;
	}
	public String getCALIFICACIONES_TAREA() {
		return CALIFICACIONES_TAREA;
	}
	public void setCALIFICACIONES_TAREA(String cALIFICACIONES_TAREA) {
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
