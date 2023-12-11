package org.example.spring.dao;

//基于 PointcutAdvisor 的 AOP 开发,切点切面的 AOP 开发
public class OrderDao {
    public void add() {
        System.out.println("正在执行 UserDao 的 add() 方法……");
    }
    public void adds() {
        System.out.println("正在执行 UserDao 的 adds() 方法……");
    }
    public void delete() {
        System.out.println("正在执行 UserDao 的 delete() 方法……");
    }
    public void modify() {
        System.out.println("正在执行 UserDao 的 modify() 方法……");
    }
    public void get() {
        System.out.println("正在执行 UserDao 的 get() 方法……");
    }
}
