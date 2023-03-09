package com.slightdream.service;

import com.slightdream.domain.ResponseResult;
import com.slightdream.domain.entity.User;

public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
