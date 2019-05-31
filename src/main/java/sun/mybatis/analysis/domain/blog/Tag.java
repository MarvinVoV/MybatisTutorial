/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sun.mybatis.analysis.domain.blog;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author hufeng
 * @version 1.0: Tag.java, v 0.1 2019年05月30日 01:07 hufeng Exp $
 */

@Setter
@Getter
@Builder
public class Tag {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Tag: " + id + " : " + name;
    }
}