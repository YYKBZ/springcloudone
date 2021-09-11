package com.my.feign.feignService;

import com.my.entity.TbApplyResource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Wangluoxin
 * @date 2021/9/7
 */

public class ApplyFeignImpl{


    public static String  m1() {
        return "错误方法1";
    }

    /**
     * 查询applyID小于50所有订单
     */

    public List<TbApplyResource> m2() {
        return null;
    }

    /**
     * 查询指定id的
     *
     * @param id
     */

    public TbApplyResource m3(Long id) {
        return null;
    }

    /**
     * 分页查询
     *
     * @param size
     * @param page
     */

    public List<TbApplyResource> m4(int size, int page) {
        return null;
    }
}
