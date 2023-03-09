package com.slightdream.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slightdream.domain.ResponseResult;
import com.slightdream.domain.entity.Comment;


/**
 * 评论表(Comment)表服务接口
 *
 * @author makejava
 * @since 2023-03-06 19:32:04
 */
public interface CommentService extends IService<Comment> {
    ResponseResult commentList(Long articleId, Integer pageNum, Integer pageSize);

    ResponseResult addComment(Comment comment);
}