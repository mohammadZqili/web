package com.luv2code.hibernate.instructor;

import com.luv2code.spring.mvc.Relations.Instructor;
import com.luv2code.spring.mvc.Relations.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructor {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        try{

            session.beginTransaction();
            Instructor inst = session.get(Instructor.class,2);
            session.delete(inst);
            session.getTransaction().commit();

        }finally{
            factory.close();
        }


    }
}
