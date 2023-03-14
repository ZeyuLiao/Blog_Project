package com.slightdream.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.slightdream.domain.entity.Role;

import java.util.List;


/**
 * 角色信息表(Role)表数据库访问层
 *
 * @author makejava
 * @since 2023-03-13 18:53:09
 */
public interface RoleMapper extends BaseMapper<Role> {
    List<String> selectRoleKeyByUserId(Long userId);
}
