package com.my.feign.feignService;

import com.my.entity.TbApplyResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Wangluoxin
 * @date 2021/9/7
 */
@FeignClient(value = "user")
public interface ApplyFeign {

    /**
     * 查询所有订单
     */
    @GetMapping("tbApplyResource/all")
     List<TbApplyResource> m1();

    /**
     * 查询applyID小于50所有订单
     */
    @GetMapping("tbApplyResource/all50")
     List<TbApplyResource> m2();
    /**
     * 查询指定id的
     */
    @GetMapping("tbApplyResource/by/{id}")
     TbApplyResource m3(@PathVariable("id") Long id);

    /**
     * 分页查询
     */
    @GetMapping("tbApplyResource/page/{page}/{size}")
     List<TbApplyResource> m4(@PathVariable("size") int size,@PathVariable("page")int page);


    @GetMapping("/tbApplyResource/testA")
    String testA();

    @GetMapping("/tbApplyResource/testB")
    String testB();

}
