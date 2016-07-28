package com.tinthon.test;

import com.tinthon.mapping.UserMapperI;
import com.tinthon.model.Classes;
import com.tinthon.model.Order;
import com.tinthon.model.User;
import com.tinthon.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by sidney on 2016/7/25.
 */
public class TestCRUD {

//    public int testAdd() {
//        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);
//
//        UserMapperI mapper = sqlsession.getMapper(UserMapperI.class);
//
//        User user = new User();
//        user.setName("王");
//        user.setAge(30);
//        int add = mapper.add(user);
//        sqlsession.close();
//        return add;
//    }
//
//    public int testUpdate() {
//        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);
//        UserMapperI mapper = sqlsession.getMapper(UserMapperI.class);
//        User user = new User();
//
//        user.setId(3);
//        user.setName("王到");
//        user.setAge(29);
//
//        int update = mapper.update(user);
//        sqlsession.close();
//        return update;
//    }
//
//    public User testGet() {
//        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);
//        UserMapperI mapper = sqlsession.getMapper(UserMapperI.class);
//
//        User user = mapper.getById(3);
//        sqlsession.close();
//        return user;
//    }
//
//    public Order testGetOrder() {
//        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);
//
//        String statement = "com.tinthon.mapping.orderMapper.getOrderById";
//        Order order = sqlsession.selectOne(statement, 1);
//
//        sqlsession.close();
//        return order;
//    }

    public Classes testGetClass() {
        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);

        String statement = "com.tinthon.mapping.classMapper.getClass";

        Classes cls = sqlsession.selectOne(statement, 1);

        sqlsession.close();
        return cls;
    }

    public Classes testGetStudent() {
        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);

        String statement = "com.tinthon.mapping.classMapper.getClassStudent";

        Classes cls = sqlsession.selectOne(statement, 1);

        sqlsession.close();
        return cls;
    }

}
