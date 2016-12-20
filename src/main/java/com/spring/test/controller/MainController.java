package com.spring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator
 * r on 2016/12/15 0015.
 */
@Controller
public class MainController {
    private static final String INDEX;
    private static final String API;

    static {
        API = "api";
        INDEX = "Index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        
        return INDEX;
    }

    @ResponseBody
    @RequestMapping(value = "/api",method = RequestMethod.GET)
    public String hello(HttpServletRequest request){
//        request.setAttribute("name","this is a hello word");
//        return API;
        return  "this is hello word";
    }
}


