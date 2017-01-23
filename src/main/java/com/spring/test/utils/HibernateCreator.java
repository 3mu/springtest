package com.spring.test.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by mulin on 2017-01-22.
 */
public class HibernateCreator {

    private SessionFactory sessionFactory;

    public HibernateCreator(String connection) {

        init(connection);
    }


    private void init(String connection) {

        Configuration config = new Configuration();
        if (connection != null && connection != "")
            config.setProperty("connection.connection_string", connection);
        String path = PathUtils.GetRoot(this) + "hibernate.cfg.xml";
        config.configure();
        sessionFactory = config.buildSessionFactory();
    }

    public Session GetSession() {

        return sessionFactory.openSession();
    }

}
