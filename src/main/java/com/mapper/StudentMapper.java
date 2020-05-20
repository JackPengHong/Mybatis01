package com.mapper;/**
 * Created by PengHong on  2020/4/21 15:30.
 */

import com.entity.Student;
import org.apache.ibatis.annotations.Select;

/**
 * @author
 * student的代理接口
 */
public interface StudentMapper {
     /**
      * mybatis的annotation模式
      * @param id 编号
      * @return 学生对象
      */
     @Select("select * from student where id = #{id}")
     Student selectStu(int id);



}
