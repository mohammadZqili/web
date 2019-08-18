package com.luv2code.hibernate.demo;

import com.luv2code.spring.mvc.Students.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ReadStudentDemo {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session = factory.getCurrentSession();

        try {
            Student stu = new Student("mohammd", "alzukaili", "ameenzqi.li@gmail.com");
            System.out.println(stu);

            session.beginTransaction();
            session.save(stu);
            session.getTransaction().commit();
            System.out.println("saving done");

            //get new session and start transaction
            session = factory.getCurrentSession();
            session.beginTransaction();

            //retrieve student based on the id : primary key
            System.out.println("Getting student with id :"+stu.getId());
            Student student = session.get(Student.class,stu.getId());

            System.out.println(student.getFirstName()+ " "+student.getLastName()+" ");
            //commit the transaction
            session.getTransaction().commit();


        } finally {
            factory.close();
        }


    }
}
