package org.example.springbootdemo;

import lombok.Data;

/**
 * ClassName: MessageInfo
 * Package: org.example.springbootdemo
 * Description: 留言板基础信息
 *
 * @Author MaxSun
 * @Create 2024/4/3 20:14
 * @Version 1.0
 */

@Data
public class MessageInfo {
    private String from;
    private String to;
    private String message;
}
