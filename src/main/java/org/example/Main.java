package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setsName("ramesh");
        s1.setRollNo(23);
        s1.setAge(20);
//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        Student s2 = null;
        s2 = session.find(Student.class,21);
        session.close();
        sf.close();
        System.out.println(s2);
    }
}