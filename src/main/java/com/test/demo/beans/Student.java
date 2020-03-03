package com.test.demo.beans;

import java.io.Serializable;

/**
 * @Description:
 * @author: HandSomeMaker
 * @date: 2020/3/2 18:19
 */
public class Student implements Serializable {
    //业务无关主键
    private Integer id;

    private String num;
    private String name;
    private int age;
    private double score;
    private String password;

    public Student() {
    }

    public Student(Integer id, String num, String name, int age, double score, String password) {
        this.id = id;
        this.num = num;
        this.name = name;
        this.age = age;
        this.score = score;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
