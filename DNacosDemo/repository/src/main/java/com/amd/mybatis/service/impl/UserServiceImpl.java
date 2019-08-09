package com.amd.mybatis.service.impl;

import com.amd.mybatis.entity.User;
import com.amd.mybatis.mapper.UserMapper;
import com.amd.mybatis.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Lazy
@Service
@AllArgsConstructor
public class UserServiceImpl  extends ServiceImpl<UserMapper, User> implements UserService {

    private  final  UserMapper userMapper;


    @Override
    public List<String> queryAllPerms(Long id) {
        return userMapper.queryAllPerms(id);
    }

    @Override
    public int updatePassword(Long id,  String newPassword) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("newPassword", newPassword);
        return userMapper.updatePassword(map);
    }


    @Override
    @Transactional
    public boolean save(User user) {
        user.setPassword("1111111");
        user.setUsername("jjjjggq");
        userMapper.insert(user);
        return true;
    }



}
