package com.max.messagewall.controller;

import com.max.messagewall.model.MessageInfo;
import com.max.messagewall.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName: MessageController
 * Package: com.max.messagewall.controller
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/4/13 11:32
 * @Version 1.0
 */
@RequestMapping("/message")
@RestController
public class MessageController {

    @Autowired
    private MessageService service;

    @RequestMapping("/publish")
    public boolean submit(String from, String to, String message) {
        if(!StringUtils.hasLength(from)
                || !StringUtils.hasLength(to)
                || !StringUtils.hasLength(message)) {
            return false;
        }
        if(service.insert(from, to, message) == 1) {
            // 插入成功
            return true;
        }
        return false;
    }

    /**
     * 获取留言墙所有
     * @return
     */
    @RequestMapping("/getList")
    public List<MessageInfo> getList() {
        return service.show();
    }
}
