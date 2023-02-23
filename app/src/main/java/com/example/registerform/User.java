package com.example.registerform;

import java.io.Serializable;

public class User   implements Serializable {
    private String name;
    private int age;
    private int phoneNum;
    private String Sex;
    private String sport;
    private String music;
    private String grade;





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

    public int getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(int phoneNum) {
        this.phoneNum = phoneNum;
    }



    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public User(String name,int age,int phoneNum, String grade,String sex, String sport,String music)
    {
        this.name=name;
        this.age =age;
        this.phoneNum = phoneNum;
        this.grade=grade;
        this.Sex = sex;
        this.sport=sport;
        this.music=music;
    }
    public User()
    {

    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
