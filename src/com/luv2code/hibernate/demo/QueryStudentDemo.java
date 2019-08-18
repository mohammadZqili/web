package com.luv2code.hibernate.demo;

import com.luv2code.spring.mvc.Students.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class QueryStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        try {
            List<Student> theStudents = session.createQuery("from Student s where s.lastName = 'alzukaili' OR s.lastName='alzukaili'").list();
            displayResult(theStudents);


            List<Student> students = session.createQuery("from Student s where 1=1").getResultList();
            displayResult(students);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }


    }

    private static void displayResult(List<Student> theStudents) {
        for (Student s : theStudents) {
            System.out.println(s);
        }
    }
}
