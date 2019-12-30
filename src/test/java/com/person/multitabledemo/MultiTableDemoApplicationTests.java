package com.person.multitabledemo;

import com.person.multitabledemo.entity.Student0;
import com.person.multitabledemo.repository.Student0Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MultiTableDemoApplicationTests {
    @Autowired
    Student0Repository student0Repository;
    @Test
    void contextLoads() {
        List<Student0> s = student0Repository.findAll();
        System.out.println(s.size());
    }

    @Test
    void insertTest(){
        Student0 student0;
        List<Student0> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(new Student0(Long.valueOf(i),Long.valueOf(i),"test_" + i, 10+i));

        }
        student0Repository.saveAll(list);
    }
}
