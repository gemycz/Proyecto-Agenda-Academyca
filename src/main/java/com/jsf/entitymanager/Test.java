package com.jsf.entitymanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.espe.model.Asignatura;
import com.espe.model.HibernateUtil;
import com.espe.model.JPAUtil;
import com.espe.model.Tareas;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
	static EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tareas tarea = new Tareas();

		// TODO Auto-generated method stub

		Connection con = null; // OBJETO CONEXION

		try {
			Class.forName("com.mysql.jdbc.Driver"); // para que java sepa que jdbc se va a utilizar
			con = DriverManager.getConnection("jdbc:mysql://localhost/agenda", "root", ""); // conección a la base de
																							// datos
			// necesita el path el usuario y la contraseña

			// para checar que se a conecado

			if (con != null) {
				System.out.println("Conexion exitosa");
			} else {
				System.out.println("Fallo de conexion");
			}

		} catch (Exception e) {
			e.printStackTrace(System.out);
		}

		List<Tareas> listaTareas = new ArrayList<Tareas>();
		// Query q = entity.createQuery("SELECT NRC_ASIGNATURA FROM Asignatura");

		Query q = entity
				.createQuery("SELECT a FROM Tareas a WHERE FECHA_ENTREGA between '2020-02-01' and '2020-02-07'");
		listaTareas = q.getResultList();
		System.out.println(listaTareas);

	}
}
