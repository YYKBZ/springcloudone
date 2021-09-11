package com.my.user.service;

import com.my.user.entity.TbApplyResource;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author WangLuoXin
 * @since 2021-09-06
 */
public interface ITbApplyResourceService extends IService<TbApplyResource> {

    List<TbApplyResource> selectId();
    TbApplyResource byId(Long id);
}
