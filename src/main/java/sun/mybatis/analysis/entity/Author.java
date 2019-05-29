
package sun.mybatis.analysis.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hufeng
 * @version $Id: Author.java, v 0.1 2019年02月15日 15:56 hufeng Exp $
 */
@Setter
@Getter
public class Author {
    private int    id;
    private String username;
    private String password;
    private String email;
    private String bio;
}