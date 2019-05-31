/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sun.mybatis.analysis.mappers;

import org.junit.Test;

import java.net.URL;

/**
 * @author hufeng
 * @version 1.0: Temp.java, v 0.1 2019年05月31日 14:07 hufeng Exp $
 */
public class Temp {
    @Test
    public void testClassLoader() {
        ClassLoader classLoader = Temp.class.getClassLoader();
        while (classLoader != null) {
            System.out.println(classLoader.getClass().getName());
            classLoader = classLoader.getParent();
        }
    }

    @Test
    public void testCurrentClassLoader() {
//        System.out.println(getClass().getClassLoader().getClass().getName());
//        System.out.println(Thread.currentThread().getContextClassLoader().getClass().getName());

        URL url = getClass().getClassLoader().getResource("mapper/TagMapper.xml");
        System.out.println(url);

    }
}