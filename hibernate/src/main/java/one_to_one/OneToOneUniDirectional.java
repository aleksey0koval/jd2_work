package one_to_one;

import one_to_one.entity.Detail;
import one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniDirectional {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Aleksey", "Kovalchuk", "IT", 600);
//            Detail detail = new Detail("Minsk", "375291234567", "asd@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");
//
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Moscow", "12345654321", "oleg@gmail.com");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");


            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);
            System.out.println(employee.getEmpDetail());

            session.getTransaction().commit();

            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }





    }
}
