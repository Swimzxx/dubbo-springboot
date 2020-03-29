package com.z.dubboprovider.provider;

import com.dto.User;
import org.apache.ibatis.jdbc.SQL;

import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;

/**
 * @Author: zxx
 * @Date: 2020/3/29 13:23
 * @Description: *
 */
public class UserProvider {


    /**
     * 获取用户列表
     * @param video
     * @return
     */
    public String selectUserList(final User video){
        return new SQL(){{

            SELECT("*");
            FROM("user");

        }}.toString();
    }



}
