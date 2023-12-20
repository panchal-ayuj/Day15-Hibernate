package org.accolite;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
    public Session getSession(){
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory=config.buildSessionFactory();
        Session session=factory.openSession();
        return session;
    }
}
