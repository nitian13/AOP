package org.example.spring.bean;

import java.util.*;


public class MyBean {
    private String name;
    private Integer age;
    private OtherBean otherBean;
    private String[] arrays;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties pros;

    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArrays() {
        return arrays;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public MyBean() {
    }

    public MyBean(String name, Integer age, OtherBean otherBean) {
        this.name = name;
        this.age = age;
        this.otherBean = otherBean;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", otherBean=" + otherBean +
                ", arrays=" + Arrays.toString(arrays) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", pros=" + pros +
                '}';
    }
}
