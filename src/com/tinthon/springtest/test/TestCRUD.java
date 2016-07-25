package com.tinthon.springtest.test;

import com.tinthon.springtest.mapping.UserMapperI;
import com.tinthon.springtest.model.User;
import com.tinthon.springtest.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by sidney on 2016/7/25.
 */
public class TestCRUD {

    public int testAdd() {
        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);

        UserMapperI mapper = sqlsession.getMapper(UserMapperI.class);

        User user = new User();
        user.setName("王");
        user.setAge(30);
        int add = mapper.add(user);
        sqlsession.close();
        return add;
    }

    public int testUpdate() {
        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);
        UserMapperI mapper = sqlsession.getMapper(UserMapperI.class);
        User user = new User();

        user.setId(3);
        user.setName("王到");
        user.setAge(29);

        int update = mapper.update(user);
        sqlsession.close();
        return update;
    }

    public User testGet() {
        SqlSession sqlsession = MyBatisUtil.getSqlSession(true);
        UserMapperI mapper = sqlsession.getMapper(UserMapperI.class);

        User user = mapper.getById(3);
        sqlsession.close();
        return user;
    }

}
