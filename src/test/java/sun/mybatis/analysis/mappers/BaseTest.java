/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sun.mybatis.analysis.mappers;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.Reader;

/**
 * @author hufeng
 * @version $Id: BaseTest.java, v 0.1 2019年02月13日 18:01 hufeng Exp $
 * <a href="https://github.com/mybatis/mybatis-3/wiki/Unit-Test">Unit-Test</a>
 */
@RunWith(JUnit4.class)
public class BaseTest {
    protected static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void setUp() throws Exception {
        // create an SqlSessionFactory
        try (Reader reader = Resources.getResourceAsReader("mybatis-config.xml")) {
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }

        // populate in-memory database
        BaseDataTest.runScript(sqlSessionFactory.getConfiguration().getEnvironment().getDataSource(),
                "schema.sql");
    }
}