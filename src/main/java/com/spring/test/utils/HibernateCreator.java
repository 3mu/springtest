package com.spring.test.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by mulin on 2017-01-22.
 */
public class HibernateCreator {

    private SessionFactory sessionFactory;

    public  HibernateCreator(String connetion){

        init(connetion);
    }

    private void init (String connection) {

        Configuration config=new Configuration();
        config.setProperty("connection.connection_string", connection);
        config.configure();
        sessionFactory=config.buildSessionFactory();
    }

    public Session GetSession() {

        return sessionFactory.openSession();
    }

}
