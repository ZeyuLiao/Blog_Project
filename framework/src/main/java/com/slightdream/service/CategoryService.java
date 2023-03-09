package com.slightdream.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slightdream.domain.ResponseResult;
import com.slightdream.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2023-03-03 16:47:11
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();

}
