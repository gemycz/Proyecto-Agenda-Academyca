package com.espe.dao;

import java.util.ArrayList;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.espe.model.JPAUtil;
import com.espe.idao.IEstudianteDao;
import com.espe.model.Estudiante;

public class EstudianteDao implements IEstudianteDao{
	
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	@Override
	public void guardar(Estudiante estudiante) {
		entity.getTransaction().begin();
		entity.persist(estudiante);
		entity.getTransaction().commit();
		
	}
	@Override
	public void editar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.merge(estudiante);
		entity.getTransaction().commit();
	}
	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Estudiante es = new Estudiante();
		es = entity.find(Estudiante.class, id);
		
		entity.getTransaction().begin();
		entity.remove(es);
		entity.getTransaction().commit();
	}
	@Override
	public Estudiante buscar(int id) {
		// TODO Auto-generated method stub
		Estudiante es = new Estudiante();
		es = entity.find(Estudiante.class, id);
		
		
		return es;
	}

	@Override
	public List<Estudiante>obtenerEstudiantes(){
		// TODO Auto-generated method stub
		List<Estudiante> listaEstudiante = new ArrayList<Estudiante>();
		Query q = entity.createQuery("SELECT es FROM Estudiante es ");
		listaEstudiante = q.getResultList(); 
		
		return listaEstudiante;
	}

}

