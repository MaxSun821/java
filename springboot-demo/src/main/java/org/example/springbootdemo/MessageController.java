package org.example.springbootdemo;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: MessageController
 * Package: org.example.springbootdemo
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/4/3 20:30
 * @Version 1.0
 */
@RequestMapping("/message")
@RestController
public class MessageController {
    private List<MessageInfo> list = new ArrayList<>();

    @RequestMapping("/publish")
    public boolean publish(MessageInfo message) {
        // 判断信息中内容合法性
        if(StringUtils.hasLength(message.getFrom()) || StringUtils.hasLength(message.getTo()) || StringUtils.hasLength(message.getMessage())) {
            list.add(message);
            return true;
        }


        return false;
    }
    @RequestMapping("/getList")
    public List<MessageInfo> getList() {
        return list;
    }
}
