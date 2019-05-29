package sun.mybatis.analysis.entity;

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
    private String phone;
    private String email;

}