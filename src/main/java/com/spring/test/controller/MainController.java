package com.spring.test.controller;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/12/15 0015.
 */
@Controller
public class MainController {
    public static final String INDEX = "Index";
    public static final String API = "api";
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        
        return INDEX;
    }

    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public String hello(HttpServletRequest request, HttpServletResponse response){
        request.setAttribute("name","this is a hello word");
        return API;
    }
}
