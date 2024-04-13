package com.max.messagewall.mapper;

import com.max.messagewall.model.MessageInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: MessageInfoMapper
 * Package: com.max.messagewall.mapper
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/4/13 11:19
 * @Version 1.0
 */

@Mapper
public interface MessageInfoMapper {
    @Select("select * from message_info where delete_flag != 1")
    List<MessageInfo> selectAll();

    @Insert("insert into message_info(`from`, `to`, `message`) values (#{from}, #{to}, #{message})")
    Integer insertMessage(String from, String to, String message);
}
