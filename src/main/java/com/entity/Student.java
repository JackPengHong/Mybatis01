package com.entity;/**
 * Created by PengHong on  2020/4/21 14:31.
 */

import lombok.Getter;
import lombok.Setter;

/**
 * @author
 */
public class Student {

    private int id;
    private String stuname;
    private int nl;   /*数据表中没有这个字段，需要再查询的时候特别引用*/


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

    public void setNl(int nl){
        this.nl=nl;
    }
    public int getNl(){
        return nl;
    }
//    public int getAge(){
//        return this.age;
//    }
//    public void setAge(int age){
//        this.age=age;
//    }

}
