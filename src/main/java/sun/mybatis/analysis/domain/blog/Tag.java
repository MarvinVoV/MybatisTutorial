/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sun.mybatis.analysis.domain.blog;



/**
 * @author hufeng
 * @version 1.0: Tag.java, v 0.1 2019年05月30日 01:07 hufeng Exp $
 */

public class Tag {
    private int id;
    private String name;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag: " + id + " : " + name;
    }
}