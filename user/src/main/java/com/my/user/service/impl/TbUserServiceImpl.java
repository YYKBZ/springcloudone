package com.my.user.service.impl;

import com.my.user.entity.TbUser;
import com.my.user.mapper.TbUserMapper;
import com.my.user.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author WangLuoXin
 * @since 2021-09-06
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
