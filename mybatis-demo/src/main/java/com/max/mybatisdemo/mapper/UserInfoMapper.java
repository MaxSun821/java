package com.max.mybatisdemo.mapper;

import com.max.mybatisdemo.model.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * ClassName: UserInfoMapper
 * Package: com.max.mybatisdemo.mapper
 * Description: 用户操作接口
 *
 * @Author MaxSun
 * @Create 2024/4/9 13:15
 * @Version 1.0
 */

@Mapper
public interface UserInfoMapper {
    // 查找所有用户信息
    // 结果映射
//    @Results(id = "resultMap", value = {
//            @Result(column = "delete_flag", property = "deleteFlag"),
//            @Result(column = "create_time", property = "createTime"),
//            @Result(column = "update_time", property = "updateTime"),
//    })
    @Select("select * from userinfo")
    List<UserInfo> searchAll();

    // 根据id查找用户信息
//    @ResultMap(value = "resultMap")
    @Select("select * from userinfo where id = #{id}")
    UserInfo selectById(Integer id);

    // 对数据库进行增添操作
    // 返回id
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into userinfo(username, password, age, gender, phone) " +
            "values (#{username}, #{password}, #{age}, #{gender}, #{phone})")
    Integer insert(UserInfo userInfo);

    // 对数据库进行删除操作
    @Delete("delete from userinfo where id = #{id}")
    Integer deleteById(Integer id);

    // 对数据库进行修改操作
    @Update("update userinfo set password = #{password} where username = #{username}")
    Integer updateByName(String username, String password);

}
