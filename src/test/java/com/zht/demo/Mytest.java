package com.zht.demo;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class Mytest {
    @Value("${myenvironment.name}")
    private String name;

    @Test
    public void getMyEnvionment(){
        System.out.println(name);
    }

}
