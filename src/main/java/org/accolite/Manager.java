
package org.accolite;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


// serializable -> converts objects into file system
public class Manager
{
    public static void main(String[] args)
    {
//        Configuration config=new Configuration();
//        config.configure("hibernate.cfg.xml");
//        SessionFactory factory=config.buildSessionFactory();
//        Session session=factory.openSession();

        Session session = HibernateUtil.getSessionFactory().openSession();


        Transaction tx=session.beginTransaction();

//        Person p1=new Person();
//        p1.setPk(new PersonPk("Ayuj", "ayuj@gmail.com"));
//        p1.setId(3);
//        p1.setAge("23");
//        p1.setName("Ayuj");
//        session.save(p1);

        Student s1 = new Student(1, "Ayuj", "Panchal", 22);
        session.save(s1);

        Student s2 = new Student(2, "Ayuj", "P", 23);
        session.save(s2);

        Set<Student> students = new HashSet<>();
        students.add(s1);
        students.add(s2);

        Batch b1 = new Batch();
        b1.setBatchId(1);
        b1.setDuration("1 hour");
        b1.setStudents(students);

        session.save(b1);

//        Student s1 = new Student(1,"Ayuj","P", 25);
//        session.save(s1);
//
//        Student s2 = new Student(1,"Ayuj","P", 24);
//        session.save(s2);


//        Student s3 = session.load(Student.class, 1);
//        System.out.println(s3.getRollno());

//        s3.setFname("aY");
//        session.update(s3);
//
//        Student s4 = session.load(Student.class, 2);
//        session.delete(s4);
//
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<Student> criteria = builder.createQuery(Student.class);
//        Root<Student> student = criteria.from(Student.class);
//        List<Student> students = session.createQuery(criteria).getResultList();
//        System.out.println(students);

        tx.commit();
        session.flush();
        session.close();
        System.out.println("done");
    }
}