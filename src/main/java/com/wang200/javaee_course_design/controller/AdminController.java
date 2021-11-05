package com.wang200.javaee_course_design.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    @RequestMapping("/adminAccout")
    public ModelAndView adminAccout(){}

    @RequestMapping("/list")
    public ModelAndView list(){}

    @RequestMapping("/add")
    public ModelAndView add(){}

    @RequestMapping("/addRepertory")
    public ModelAndView add(){}

    @RequestMapping("/decreaseRepertory")
    public ModelAndView decreaseRepertory(){}
}
