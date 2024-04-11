package com.max.mybatisdemo.mapper;

import com.max.mybatisdemo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: UserInfoXMLMapper
 * Package: com.max.mybatisdemo.mapper
 * Description:
 *
 * @Author MaxSun
 * @Create 2024/4/10 12:42
 * @Version 1.0
 */
@Mapper
public interface UserInfoXMLMapper {
    List<UserInfo> selectAll();

    Integer insert(UserInfo userInfo);

    Integer delete(String username);

    Integer update(String username, String password);
}
