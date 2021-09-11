package com.my.user.service.impl;

import com.my.user.entity.TbMessage;
import com.my.user.mapper.TbMessageMapper;
import com.my.user.service.ITbMessageService;
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
public class TbMessageServiceImpl extends ServiceImpl<TbMessageMapper, TbMessage> implements ITbMessageService {

}
