package org.example.spring;

import org.example.spring.dao.OrderDao;
import org.example.spring.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//自动代理
public class MainApp200 {
    public static void main(String[] args) {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
        //获取代理对象
        UserDao userDao = context.getBean("userDao", UserDao.class);
        //获取代理对象
        OrderDao orderDao = context.getBean("orderDao", OrderDao.class);
        //调用 UserDao 中的各个方法
        userDao.add();
        userDao.delete();
        userDao.modify();
        userDao.get();
        //调用 OrderDao 中的各个方法
        orderDao.add();
        orderDao.adds();
        orderDao.delete();
        orderDao.get();
        orderDao.modify();
    }
}
