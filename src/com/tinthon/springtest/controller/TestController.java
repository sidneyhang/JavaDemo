package com.tinthon.springtest.controller;

import com.tinthon.springtest.model.Classes;
import com.tinthon.springtest.model.Order;
import com.tinthon.springtest.model.User;
import com.tinthon.springtest.test.TestCRUD;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sidney on 2016/7/23.
 */

@Controller
public class TestController {
    public TestController() {
        System.out.println("TestController...");
    }

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public ModelAndView testMVC() throws IOException {
        ModelAndView modelview = new ModelAndView("test");


//        String resource = "config/conf.xml";
//        InputStream is = TestController.class.getClassLoader().getResourceAsStream(resource);
//        SqlSessionFactory sessionFac = new SqlSessionFactoryBuilder().build(is);
//        SqlSession session = sessionFac.openSession();
//
//        String statement = "com.tinthon.springtest.mapping.userMapper.getUser";
//        User user = session.selectOne(statement, 1);
//


        //测试 getOrder
//        Order order = new TestCRUD().testGetOrder();
//
//        modelview.addObject("id", order.getId());
//        modelview.addObject("Order_No", order.getOrderNo());
//        modelview.addObject("Price", order.getPrice());

        //测试 getClass
        Classes cls = new TestCRUD().testGetClass();

        modelview.addObject("id", cls.getId());
        modelview.addObject("name", cls.getName());
        modelview.addObject("teacher_id", cls.getTeacher().getId());
        return modelview;
    }
}
