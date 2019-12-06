package com.espe.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.espe.idao.ITareasDao;
import com.espe.model.Tareas;
import com.espe.model.JPAUtil;

public class TareasDao implements ITareasDao {

	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
	@Override
	public void guardar(Tareas tareas) {
		// TODO Auto-generated method stub
		
		entity.getTransaction().begin();
		entity.persist(tareas);
		entity.getTransaction().commit();
		
	}

	@Override
	public void editar(Tareas tareas) {
		// TODO Auto-generated method stub
		entity.getTransaction().begin();
		entity.merge(tareas);
		entity.getTransaction().commit();
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		Tareas t = new Tareas();
		t = entity.find(Tareas.class, id);
		
		entity.getTransaction().begin();
		entity.remove(t);
		entity.getTransaction().commit();
	}
	
	@Override
	public Tareas buscar(int id) {
		// TODO Auto-generated method stub
		Tareas t = new Tareas();
		t = entity.find(Tareas.class, id);
		
		return t;
	}

	@Override
	public List<Tareas> obtenerTareas() {
		// TODO Auto-generated method stub
		List<Tareas> listaTareas = new ArrayList<Tareas>();
		Query q = entity.createQuery("SELECT t FROM Tareas t");
		listaTareas = q.getResultList();
		
		return listaTareas;
	}

}
