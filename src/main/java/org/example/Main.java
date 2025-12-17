package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("Ganesh");
        s1.setRollNo(20);
        s1.setAge(20);

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();
        System.out.println(s1);
    }
}