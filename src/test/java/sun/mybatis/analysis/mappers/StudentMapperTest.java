package sun.mybatis.analysis.mappers;

import sun.mybatis.analysis.entity.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author hufeng
 * @version $Id: StudentMapperTest.java, v 0.1 2019-02-13 17:49 hufeng Exp $
 */
public class StudentMapperTest extends BaseTest {
    @Test
    public void testInsert() {
        Student a = Student.builder()
                .name("jack")
                .email("tt@gmail.com")
                .branch("math")
                .percentage(30)
                .phone("22234232")
                .build();

        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
            int r = mapper.insert(a);
            sqlSession.commit();
            assertTrue(r > 0);
        }
    }
}