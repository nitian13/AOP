package org.example.spring;

import org.example.spring.bean.MyBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-bean.xml")
public class SpringTest {
    @Autowired
    private MyBean myBean;
    @Test
    public void test(){
        System.out.println(myBean);
        System.out.println(myBean.getArrays().length);
        System.out.println(myBean.getList().toString());
        System.out.println(myBean.getList().size());
        System.out.println(myBean.getMap().toString());
        System.out.println(myBean.getMap().size());
        System.out.println(myBean.getPros().toString());
    }
}
