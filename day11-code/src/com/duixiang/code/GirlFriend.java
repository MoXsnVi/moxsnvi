package com.duixiang.code;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;
    //针对私有化的成员变量赋值 提供get 和set方法
    //set方法 给成员变量赋值
    //get方法 对外提供成员变量的值


    //姓名
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //年龄
    public void setAge(int age) {
        if (age >= 18 && age <= 50) {
            this.age = age;

        } else {
            System.out.println("非法参数");
        }
    }

    public int getAge() {
        return age;
    }

    //性别
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

}
