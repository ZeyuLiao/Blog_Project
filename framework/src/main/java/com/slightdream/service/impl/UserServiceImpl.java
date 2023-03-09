package com.slightdream.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.slightdream.domain.entity.User;
import com.slightdream.mapper.UserMapper;
import com.slightdream.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户表(User)表服务实现类
 *
 * @author makejava
 * @since 2023-03-06 19:38:55
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
