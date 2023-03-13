package com.slightdream.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slightdream.domain.ResponseResult;
import com.slightdream.domain.entity.Article;

/**
 * (Article)表服务接口
 *
 * @author makejava
 * @since 2023-03-01 18:51:58
 */
public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);
}

