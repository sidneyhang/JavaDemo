package com.tinthon.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by sidney on 2016/7/23.
 */

@Controller
public class TestController {
    public TestController() {
        System.out.println("TestController...");
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ModelAndView testMVC() {
        ModelAndView modelview = new ModelAndView("test");
        modelview.addObject("info", "liil");
        return modelview;
    }
}
