package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author hongrun.yu
 * @date 2018-08-16 11:09
 */
@RestController
public class IndexController {
    @RequestMapping(value = {"","/","/index"},method = RequestMethod.GET)
    public ModelAndView index( ModelAndView mv){
        mv.setViewName("/view/index");
        return mv;
    }

}
