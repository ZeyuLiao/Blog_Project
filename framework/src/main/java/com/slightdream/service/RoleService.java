package com.slightdream.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.slightdream.domain.entity.Role;

import java.util.List;


/**
 * 角色信息表(Role)表服务接口
 *
 * @author makejava
 * @since 2023-03-13 18:53:09
 */
public interface RoleService extends IService<Role> {
     List<String> selectRoleKeyByUserId(Long id);
}
