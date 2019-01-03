/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sun.mybatis.tutorial.entity;

import lombok.*;

/**
 * @author hufeng
 * @version $Id: Student.java, v 0.1 2019年01月03日 19:55 hufeng Exp $
 */
@Getter
@Setter
@Builder
public class Student {
    private int    id;
    private String name;
    private String branch;
    private int    percentage;
    private int    phone;
    private String email;

}