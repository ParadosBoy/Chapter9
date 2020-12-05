package com.test;

import com.po.Orders;
import com.po.Person;
import com.po.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;

/**
 * @author 10574
 */
public class MybatisAssociatedTest {
    @Test
    public void findCodeByIdTest() {
        SqlSession sqlSession = MybatisUtils.getSession();
        Person person = sqlSession.selectOne("com.mapper." + "PersonMapper.findPersonById", 1);
        System.out.println(person);
        sqlSession.close();
    }

    @Test
    public void findCodeByIdTest2() {
        SqlSession sqlSession = MybatisUtils.getSession();
        Person person = sqlSession.selectOne("com.mapper." + "PersonMapper.findPersonById2", 1);
        System.out.println(person);
        sqlSession.close();
    }

    @Test
    public void findUserTest() {
        SqlSession sqlSession = MybatisUtils.getSession();
        User user = sqlSession.selectOne("com.mapper." + "UserMapper.findUserWithOrders", 1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void findOrdersTest() {
        SqlSession sqlSession = MybatisUtils.getSession();
        Orders orders = sqlSession.selectOne("com.mapper." + "OrdersMapper.findOrdersWithProduct", 1);
        System.out.println(orders);
        sqlSession.close();
    }

    @Test
    public void findOrdersTest2() {
        SqlSession sqlSession = MybatisUtils.getSession();
        Orders orders = sqlSession.selectOne("com.mapper." + "OrdersMapper.findOrdersWithProduct2", 1);
        System.out.println(orders);
        sqlSession.close();
    }
}
