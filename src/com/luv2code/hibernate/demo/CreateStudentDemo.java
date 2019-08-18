package com.luv2code.hibernate.demo;

import com.luv2code.spring.mvc.Students.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;


public class CreateStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {

            Student stu = new Student("mohammd", "alzukaili", "ameenzqi.li@gmail.com");


            session.beginTransaction();

            session.save(stu);


            session.getTransaction().commit();
            System.out.println("done");
        } finally {
            factory.close();
        }


    }
}
