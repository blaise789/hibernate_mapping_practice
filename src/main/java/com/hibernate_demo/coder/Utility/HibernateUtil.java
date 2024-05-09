package com.hibernate_demo.coder.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
    private static SessionFactory sessionfactory;
    public static SessionFactory getSessionFactory() {
        if(sessionfactory==null) {
            try {
                Configuration con= new Configuration().configure();
                sessionfactory=con.buildSessionFactory();
            }catch (Exception e) {
                // TODO: handle exception
                System.out.println(e.getMessage());
            }

        }
        return sessionfactory;
    }
}
