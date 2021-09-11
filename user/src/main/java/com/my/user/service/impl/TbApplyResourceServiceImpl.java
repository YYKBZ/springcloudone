package com.my.user.service.impl;

import com.my.user.entity.TbApplyResource;
import com.my.user.mapper.TbApplyResourceMapper;
import com.my.user.service.ITbApplyResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WangLuoXin
 * @since 2021-09-06
 */
@Service
public class TbApplyResourceServiceImpl extends ServiceImpl<TbApplyResourceMapper, TbApplyResource> implements ITbApplyResourceService {

    @Autowired
    private TbApplyResourceMapper tbApplyResourceMapper;

    @Override
    public List<TbApplyResource> selectId() {
        return tbApplyResourceMapper.selectId();
    }

    @Override
    public TbApplyResource byId(Long id) {
        return tbApplyResourceMapper.byId(id);
    }
}
