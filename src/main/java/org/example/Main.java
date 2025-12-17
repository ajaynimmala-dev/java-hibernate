package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("Ganesh");
        s1.setRollNo(20);
        s1.setAge(20);

        Configuration cfg = new Configuration();

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        session.persist(s1);
    }
}