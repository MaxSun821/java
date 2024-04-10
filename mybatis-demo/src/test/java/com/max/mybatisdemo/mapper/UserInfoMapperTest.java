package com.max.mybatisdemo.mapper;

import com.max.mybatisdemo.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Insert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ClassName: UserInfoMapperTest
 * Package: com.max.mybatisdemo.mapper
 * Description: 测试类
 *
 * @Author MaxSun
 * @Create 2024/4/9 13:17
 * @Version 1.0
 */

@Slf4j
@SpringBootTest
class UserInfoMapperTest {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Test
    void searchAll() {
        log.info(userInfoMapper.searchAll().toString());
    }

    @Test
    void selectById() {
        log.info(userInfoMapper.selectById(2).toString());
    }

    @Test
    void insert() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("tianqi");
        userInfo.setPassword("tianqi");
        userInfo.setAge(28);
        userInfo.setGender(2);
        userInfo.setPhone("18723450006");

        Integer ret = userInfoMapper.insert(userInfo);

        log.info("ret:" + ret + ", id:" + userInfo.getId());
    }

    @Test
    void deleteById() {
        log.info(userInfoMapper.deleteById(3).toString());
    }

    @Test
    void updateByName() {
        log.info(userInfoMapper.updateByName("zhaoliu", "zhaoliu").toString());
    }
}