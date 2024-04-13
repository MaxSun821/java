package com.max.messagewall.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * ClassName: MessageInfo
 * Package: com.max.messagewall.model
 * Description: 留言墙信息对象，一个留言墙信息对象代表数据库一条数据
 *
 * @Author MaxSun
 * @Create 2024/4/13 11:19
 * @Version 1.0
 */

@Repository
@Data
public class MessageInfo {
    private Integer id;
    private String from;
    private String to;
    private String message;
    private Integer deleteFlag;
    private Date createTime;
    private Date updateTime;
}
