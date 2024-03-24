package com.max.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * ClassName: Blog
 * Package: com.max.domain
 * Description: 博客类，一个博客对象对应数据库中的博客表一条记录
 *
 * @Author MaxSun
 * @Create 2024/3/20 19:11
 * @Version 1.0
 */
public class Blog {
    private int blogId;
    private String title;
    private String summary;
    private String content;
    private Timestamp time;
    private int userId;

    public Blog() {
    }

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String formatTime = format.format(time);
        return formatTime;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
