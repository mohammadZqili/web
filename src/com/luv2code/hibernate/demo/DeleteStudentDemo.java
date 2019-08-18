package com.luv2code.hibernate.demo;

import com.luv2code.spring.mvc.Students.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class DeleteStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        //begin transaction
        session.beginTransaction();

        try {
            Student theStudent = session.get(Student.class,2);


            //way 1
            //Delete Student from database
            session.delete(theStudent);

            //way 2:
            session.createQuery("delete from Student where id = 2").executeUpdate();



            //transaction commit
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
