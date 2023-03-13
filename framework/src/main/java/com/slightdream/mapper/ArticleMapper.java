package com.slightdream.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.slightdream.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
