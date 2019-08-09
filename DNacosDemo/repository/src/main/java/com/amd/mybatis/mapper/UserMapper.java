package com.amd.mybatis.mapper;

import com.amd.mybatis.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * gus
 */
public interface UserMapper   extends BaseMapper<User> {

    /**
     * 查询用户的所有权限
     * @param id  用户ID
     */
    List<String> queryAllPerms(Long id);

    /**
     * 修改密码
     */
    int updatePassword(Map<String, Object> map);


}