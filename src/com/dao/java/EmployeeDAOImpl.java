package com.dao.java;

import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dto.java.EmployeeDTO;
import com.hibernate.util.HibernateUtil;

public class EmployeeDAOImpl implements IEmployeeDAO {

	@Override
	public void insert(EmployeeDTO employee) {
		try{
			Session session = HibernateUtil.buildSessionFactoryObj().openSession();
			session.beginTransaction();
			session.save(employee);
			session.getTransaction().commit();
		}catch (Exception e) {
			throw e;
		}
		
	}

	@Override
	public void update(EmployeeDTO employee) {
		Session session = HibernateUtil.buildSessionFactoryObj().openSession();
		session.beginTransaction();
		session.update(employee);
		session.getTransaction().commit();
	}

	@Override
	public void delete(EmployeeDTO employee) {
		Session session = HibernateUtil.buildSessionFactoryObj().openSession();
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction().commit();

	}

	@Override
	public List<EmployeeDTO> fetch() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.buildSessionFactoryObj().openSession();
		org.hibernate.Query query = session.createQuery("from EmployeeDTO");
		List list = query.list();
		//List<EmployeeDTO> employees = Collections.checkedList(list, EmployeeDTO.class);
		//List<EmployeeDTO> employees = HibernateUtil.buildSessionFactoryObj().getCurrentSession().createCriteria(EmployeeDTO.class).list();
		return list;
	}

}
