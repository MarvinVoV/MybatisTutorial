/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sun.mybatis.analysis.domain.blog;

/**
 * @author hufeng
 * @version 1.0: Comment.java, v 0.1 2019年05月30日 01:11 hufeng Exp $
 */
public class Comment {

    private int id;
    private Post post;
    private String name;
    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Comment: " + id + " : " + name + " : " + comment;
    }
}