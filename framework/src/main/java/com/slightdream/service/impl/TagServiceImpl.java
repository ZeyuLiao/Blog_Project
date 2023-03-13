package com.slightdream.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.slightdream.domain.entity.Tag;
import com.slightdream.mapper.TagMapper;
import com.slightdream.service.TagService;
import org.springframework.stereotype.Service;

/**
 * 标签(Tag)表服务实现类
 *
 * @author makejava
 * @since 2023-03-12 23:19:44
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
