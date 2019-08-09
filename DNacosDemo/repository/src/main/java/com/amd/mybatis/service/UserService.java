package com.amd.mybatis.service;

import com.amd.mybatis.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserService extends IService<User> {

    List<String> queryAllPerms(Long id);

    int updatePassword(Long id, String newPassword);



}
