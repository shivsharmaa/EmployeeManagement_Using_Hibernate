package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

import java.util.List;

public class EmployeeDao {
    private SessionFactory factory;

    public EmployeeDao() {
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    
    // ------------------------------------- save details -------------------------------------------------
    public void saveEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(employee);
        transaction.commit();
        session.close();
    }


    // ------------------------------------- Get All employee details -------------------------------------------------

    
    public List<Employee> getAllEmployees() {
        Session session = factory.openSession();
        List<Employee> employees = session.createQuery("from Employee", Employee.class).list();
        session.close();
        return employees;
    }

    
    // ------------------------------------- get Employee by Id details -------------------------------------------------

    public Employee getEmployeeById(int id) {
        Session session = factory.openSession();
        Employee employee = session.get(Employee.class, id);
        session.close();
        return employee;
    }

    // ------------------------------------- Update Details -------------------------------------------------

    public void updateEmployee(Employee employee) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(employee);
        transaction.commit();
        session.close();
    }

    public void deleteEmployee(int id) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee = session.get(Employee.class, id);
        if (employee != null) {
            session.remove(employee);
        }
        transaction.commit();
        session.close();
    }
}
