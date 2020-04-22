package com.entity;/**
 * Created by PengHong on  2020/4/21 14:31.
 */

/**
 * @author
 */
public class Student {

    private int id;
    private String stuname;
    private int age;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setStuname(String stuname){
        this.stuname=stuname;
    }
    public  String getStuname(){
        return this.stuname;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }

}
