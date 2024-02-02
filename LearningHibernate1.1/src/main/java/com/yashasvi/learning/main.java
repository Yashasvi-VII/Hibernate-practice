/*
I want to persist the data into dataBase

To create object of session we need to create object of session factory.
to create object of session factory configuration class.

open session method will give you object of session.

hibernate.cfg.xml file should be in resource folder inside src

whenever we need to add to db we need transaction object.
and we need to ask hibernate to create table

 */
package com.yashasvi.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class main {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmpId(11);
        emp.setEmpName("john");

        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);

        SessionFactory sf = con.buildSessionFactory();

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(emp);

        tx.commit();
    }
}
