package com.wang200.javaee_course_design.controller;

import com.wang200.javaee_course_design.service.AccountService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/shopping")
public class SinginController {

    @Autowired
    private Request request;
    private AccountService accountService;

    @RequestMapping("/formall_signin")
    public ModelAndView formall_signin(){
//        request.setAttribute("password","");
        if(request.getPathParameter("password").equals(request.getPathParameter("password'"))){
            accountService.add
        }
    }

    @RequestMapping("/sign_in")
    public ModelAndView sign_in(){}

    @RequestMapping("/adminSignin")
    public ModelAndView adminSignin(){}
}
