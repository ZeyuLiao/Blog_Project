package com.slightdream.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slightdream.domain.ResponseResult;
import com.slightdream.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2023-03-06 19:38:55
 */
public interface UserService extends IService<User> {

    ResponseResult<User> userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);

}
