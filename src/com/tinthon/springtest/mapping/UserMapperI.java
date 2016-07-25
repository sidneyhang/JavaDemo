package com.tinthon.springtest.mapping;

import com.tinthon.springtest.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by sidney on 2016/7/25.
 */
public interface UserMapperI {

    @Insert("insert into users(name, age) values(#{name},#{age})")
    public int add(User user);

    //使用@Delete注解指明deleteById方法要执行的SQL
    @Delete("delete from users where id=#{id}")
    public int deleteById(int id);

    //使用@Update注解指明update方法要执行的SQL
    @Update("update users set name=#{name},age=#{age} where id=#{id}")
    public int update(User user);

    //使用@Select注解指明getById方法要执行的SQL
    @Select("select * from users where id=#{id}")
    public User getById(int id);

    //使用@Select注解指明getAll方法要执行的SQL
    @Select("select * from users")
    public List<User> getAll();
}