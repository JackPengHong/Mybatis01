package com.mapper;/**
 * Created by PengHong on  2020/4/21 15:30.
 */

import com.entity.Student;

/**
 * @author
 * student的代理接口
 */
public interface StudentMapper {

    public Student selectOne(int id);

}
