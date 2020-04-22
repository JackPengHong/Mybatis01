package test;/**
 * Created by PengHong on  2020/4/21 15:12.
 */

import com.entity.Student;
import com.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;


/**
 * @author
 * 学生测试类
 */
public class StudentTest {

    @Test
    public  void test(){
        String resource="mybatis-config.xml";
        InputStream inputStream=null;
        SqlSessionFactory sqlSessionFactory=null;
        SqlSession session=null;
        Student student=new Student();
        try{
            inputStream= Resources.getResourceAsStream(resource);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            session=sqlSessionFactory.openSession();
//          student=session.selectOne("com.mapper.StudentMapper.selectOne",4);
            //这种方法不依赖字符串字面值，会更安全一点
            StudentMapper studentMapper=session.getMapper(StudentMapper.class);
            student=studentMapper.selectOne(7);

            System.out.println("编号:"+student.getId());
            System.out.println("姓名:"+student.getStuname());
            System.out.println("年龄:"+student.getAge());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(session !=null){
                session.close();
            }
        }

    }


}
