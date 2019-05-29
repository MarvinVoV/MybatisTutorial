/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */
package sun.mybatis.analysis.domain.blog;

import java.util.List;

/**
 * @author hufeng
 * @version 1.0: Blog.java, v 0.1 2019年05月30日 01:13 hufeng Exp $
 */
public class Blog {

    private int        id;
    private String     title;
    private Author     author;
    private List<Post> posts;

    public Blog() {
    }

    public Blog(int id, String title, Author author, List<Post> posts) {
        this();
        this.id = id;
        this.title = title;
        this.author = author;
        this.posts = posts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public String toString() {
        return "Blog: " + id + " : " + title + " (" + author + ")";
    }
}