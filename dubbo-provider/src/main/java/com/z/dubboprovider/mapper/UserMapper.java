package com.z.dubboprovider.mapper;

import com.dto.User;
import com.z.dubboprovider.provider.UserProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * @Author: zxx
 * @Date: 2020/3/29 13:04
 * @Description: *
 */
public interface UserMapper {

    @SelectProvider(type = UserProvider.class, method = "selectUserList")
    List<User> selectUserList();
}
