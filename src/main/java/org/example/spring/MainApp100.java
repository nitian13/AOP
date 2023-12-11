package org.example.spring;

import org.example.spring.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//基于 PointcutAdvisor 的 AOP 开发,切点切面的 AOP 开发
public class MainApp100 {
    public static void main(String[] args) {
        //获取 ApplicationContext 容器
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        //获取代理对象
        OrderDao orderDao = context.getBean("orderDaoProxy", OrderDao.class);
        //调用 OrderDao 中的各个方法
        orderDao.add();
        orderDao.adds();
        orderDao.delete();
        orderDao.get();
        orderDao.modify();
    }
}
