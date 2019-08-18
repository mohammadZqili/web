package com.luv2code.hibernate.instructor;

import com.luv2code.spring.mvc.Relations.Instructor;
import com.luv2code.spring.mvc.Relations.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructorAndDetail {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try{

            session.beginTransaction();
            //create Relations
            Instructor instructor = new Instructor("Mohammad alzukaili","hello@gmail.com");
            InstructorDetail instructorDetail = new InstructorDetail("helloAlzukaili","managment and Be Great Person");

            instructor.setInstructorDetail(instructorDetail);



            session.save(instructor);
            session.getTransaction().commit();

        }finally{
            session.close();
            factory.close();

        }



    }
}
