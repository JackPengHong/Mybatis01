package com.mapper;/**
 * Created by PengHong on  2020/4/21 15:30.
 */

import com.entity.Student;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import javax.annotation.Resource;

/**
 * @author
 * student的代理接口
 */
public interface StudentMapper {
     /**
      * mybatis的annotation模式
      * 学生表中没有nl字段，User类中没有age字段
      * @param id 编号
      * @return 学生对象Results
      */
     @Results({
             @Result(property = "nl",column = "age")
     })
     @Select("select id,stuname,age from student where id = #{id}")
     Student selectStu(int id);



}
