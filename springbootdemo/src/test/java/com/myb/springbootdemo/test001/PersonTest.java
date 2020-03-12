package com.myb.springbootdemo.test001;

import com.myb.springbootdemo.model.Person;



public class PersonTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.setId(10);
        p.setName("丽丽");
        System.out.println("name:"+p.getName()+" "+"id:"+p.getId());
    }
}
