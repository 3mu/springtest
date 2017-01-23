package com.spring.test.controller;

import com.spring.test.utils.HibernateCreator;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.spring.test.entity.*;

import java.util.List;

/**
 * Created by Administrator
 * r on 2016/12/15 0015.
 */
@Controller
public class MainController {
    private static final String INDEX;

    static {
        INDEX = "Index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return INDEX;
    }

    @ResponseBody
    @RequestMapping(value = "/api", method = RequestMethod.GET)
    public String hello() {
        HibernateCreator creator=new HibernateCreator("");
        Session session=creator.GetSession();
        NativeQuery query=session.createSQLQuery("select count(1) from ensecret");
        Object list= query.getSingleResult();
        return list.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/api/get", method = RequestMethod.GET)
    public User user() {
        User user = new User();
        user.setAge(10);
        user.setName("hello user");
        return user;
    }
}



