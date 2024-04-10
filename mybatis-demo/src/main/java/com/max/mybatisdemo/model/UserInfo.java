package com.max.mybatisdemo.model;

import lombok.Data;

import java.util.Date;

/**
 * ClassName: UserInfo
 * Package: com.max.mybatisdemo.model
 * Description: 用户类
 *
 * @Author MaxSun
 * @Create 2024/4/9 13:12
 * @Version 1.0
 */

@Data
public class UserInfo {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Integer gender;
    private String phone;
    private Integer deleteFlag;
    private Date createTime;
    private Date updateTime;
}
