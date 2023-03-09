package com.slightdream.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slightdream.domain.ResponseResult;
import com.slightdream.domain.entity.Link;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2023-03-03 22:10:21
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}
