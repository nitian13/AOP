package org.example.spring;

import org.example.spring.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//一般切面的 AOP 开发
public class MainApp {
    public static void main(String[] args) {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //获取代理对象
        UserDao userDao = context.getBean("userDaoProxy", UserDao.class);
        //调用 UserDao 中的各个方法
        userDao.add();
        userDao.delete();
        userDao.get();
        userDao.modify();
    }
}
