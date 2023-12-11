package org.example.spring.dao.impl;

import org.example.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("正在执行 UserDao 的 add() 方法……");
    }
    @Override
    public void delete() {
        System.out.println("正在执行 UserDao 的 delete() 方法……");
    }
    @Override
    public void modify() {
        System.out.println("正在执行 UserDao 的 modify() 方法……");
    }
    @Override
    public void get() {
        System.out.println("正在执行 UserDao 的 get() 方法……");
    }
}
