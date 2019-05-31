package sun.mybatis.analysis.mappers;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sun.mybatis.analysis.domain.blog.Tag;

import static org.junit.Assert.assertTrue;

/**
 * @author hufeng
 * @version $Id: TagMapperTest.java, v 0.1 2019-02-13 17:49 hufeng Exp $
 */
public class TagMapperTest extends BaseTest {
    @Test
    public void testInsert() {
        Tag a = Tag.builder()
                .name("jack")
                .build();

        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            TagMapper mapper = sqlSession.getMapper(TagMapper.class);
            int r = mapper.insert(a);
            sqlSession.commit();
            assertTrue(r > 0);
        }
    }
}