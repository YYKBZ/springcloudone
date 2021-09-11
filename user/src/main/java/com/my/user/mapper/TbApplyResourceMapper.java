package com.my.user.mapper;

import com.my.user.entity.TbApplyResource;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author WangLuoXin
 * @since 2021-09-06
 */
@Mapper
public interface TbApplyResourceMapper extends BaseMapper<TbApplyResource> {

     List<TbApplyResource> selectId();

     TbApplyResource byId(Long id);

}
