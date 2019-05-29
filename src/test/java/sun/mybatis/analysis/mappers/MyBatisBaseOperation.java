package sun.mybatis.analysis.mappers;

import com.alibaba.fastjson.JSON;
import sun.mybatis.analysis.entity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/**
 * @author hufeng
 * @version $Id: MyBatisBaseOperation.java, v 0.1 2019年01月03日 20:10 hufeng Exp $
 */
@RunWith(JUnit4.class)
public class MyBatisBaseOperation {
    private static Logger logger = LoggerFactory.getLogger(MyBatisBaseOperation.class);

    private static Reader            reader;
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init() throws IOException {
        reader = Resources.getResourceAsReader("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    @Test
    public void testInsert() {
        SqlSession session = sqlSessionFactory.openSession();
        Student student = Student.builder()
                .name("Mohammad")
                .branch("it")
                .percentage(80)
                .phone("984803322")
                .email("Mohammad@gmail.com").
                        build();

        // namespace+statementId
        session.insert("sun.mybatis.tutorial.entity.insert", student);
        if (logger.isInfoEnabled()) {
            logger.info("Insert done. id={}", student.getId());
        }
        session.commit();
        session.close();
    }

    @Test
    public void testRead() {
        SqlSession session = sqlSessionFactory.openSession();

        //select contact all contacts
        List<Student> student = session.selectList("sun.mybatis.tutorial.entity.getAll");

        for (Student st : student) {
            if (logger.isInfoEnabled()) {
                logger.info(JSON.toJSONString(st));
            }
        }
        if (logger.isInfoEnabled()) {
            logger.info("Records Read Successfully ");
        }
        session.commit();
        session.close();
    }

    @Test
    public void testReadById() {
        SqlSession session = sqlSessionFactory.openSession();

        //select contact all contacts
        Student student = session.selectOne("sun.mybatis.tutorial.entity.getById", 2);
        assertNotNull(student);
        if (logger.isInfoEnabled()) {
            logger.info(JSON.toJSONString(student));
        }
        session.commit();
        session.close();
    }

    @Test
    public void testUpdate() {
        SqlSession session = sqlSessionFactory.openSession();

        //select contact all contacts
        Student student = session.selectOne("sun.mybatis.tutorial.entity.getById", 2);
        assertNotNull(student);
        if (logger.isInfoEnabled()) {
            logger.info(JSON.toJSONString(student));
        }

        student.setEmail("mohamad123@yahoo.com");
        student.setPhone("90000001");
        session.update("sun.mybatis.tutorial.entity.update", student);
        session.commit();

        // verify
        Student std = session.selectOne("sun.mybatis.tutorial.entity.getById", 2);
        if (logger.isInfoEnabled()) {
            logger.info(JSON.toJSONString(std));
        }
        session.commit();
        session.close();
    }

    @Test
    public void testDelete() {
        SqlSession session = sqlSessionFactory.openSession();
        session.delete("sun.mybatis.tutorial.entity.deleteById", 3);
        session.commit();
        session.close();
    }

    @AfterClass
    public static void destroy() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }
}