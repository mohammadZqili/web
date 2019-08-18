package com.luv2code.hibernate.demo;

import com.luv2code.spring.mvc.Students.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class UpdateStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        //begin transaction
        session.beginTransaction();

        try {

            //way 1 : getTransaction().commit()
            Student theStudent1 = session.get(Student.class,2);
            System.out.println("before updating : " + theStudent1);


            //update student
            theStudent1.setEmail("way1@Hibernate.com");
            System.out.println(theStudent1);




            //way 2 : executeUpdate()
            session.createQuery("update Student set email='way2@Hibernate.com'").executeUpdate();


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
