
package sun.mybatis.analysis.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author hufeng
 * @version $Id: Blog.java, v 0.1 2019年02月15日 15:53 hufeng Exp $
 */
@Getter
@Setter
public class Blog {
    private int    id;
    private String title;
    private String body;
    private Author author;
    private Date   createTime;

    public Blog() {
    }

    public Blog(int blogId) {
        this.id = blogId;
    }
}