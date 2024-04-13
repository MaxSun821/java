package com.max.messagewall.service;

import com.max.messagewall.mapper.MessageInfoMapper;
import com.max.messagewall.model.MessageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: MessageService
 * Package: com.max.messagewall.service
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/4/13 11:18
 * @Version 1.0
 */

@Service
public class MessageService {
    // 注入Mapper对象
    @Autowired
    private MessageInfoMapper messageInfoMapper;

    public List<MessageInfo> show() {
        return messageInfoMapper.selectAll();
    }

    public Integer insert(String from, String to, String message) {
        return messageInfoMapper.insertMessage(from, to, message);
    }
}
