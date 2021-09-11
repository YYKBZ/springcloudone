package com.my.feign.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.my.entity.TbApplyResource;
import com.my.feign.feignService.ApplyFeign;
import com.my.feign.feignService.ApplyFeignImpl;
import com.my.feign.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wangluoxin
 * @date 2021/9/7
 */
@Slf4j
@RestController
@RequestMapping("/feign")
public class ApplyController {

    @Autowired
    private ApplyFeign applyFeign;

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RabbitTemplate rabbitTemplate;


    /**
     * 查询所有订单
     */
    @GetMapping("/m1")
    @SentinelResource(value ="blockException" ,blockHandler = "he")
    List<TbApplyResource> m1(){
        List<TbApplyResource> tbApplyResources = applyFeign.m1();
        String s = tbApplyResources.toString();
        //rabbitTemplate.convertAndSend("payExchange", "",s);
        System.out.println("发送消息");
        return tbApplyResources;
    }


    public List<TbApplyResource> he(BlockException blockException){
        ArrayList<TbApplyResource> objects = new ArrayList<>();
        objects.add(new TbApplyResource());
        System.out.println("调用熔断方法");
        return objects;
    }


    /**
     * 查询applyID小于50所有订单
     */
    @GetMapping("/all50")
    List<TbApplyResource> m2(){
        List<TbApplyResource> tbApplyResources = applyFeign.m2();
        return tbApplyResources;
    }
    /**
     * 查询指定id的
     */
    @GetMapping("/by/{id}")
    TbApplyResource m3(@PathVariable("id") Long id){
        Object string = redisUtil.getString(id.toString());
        if (string==null){
            TbApplyResource tbApplyResource = applyFeign.m3(id);
            redisUtil.setString(id.toString(),tbApplyResource);
            return tbApplyResource;
        }else {
            System.out.println(string);
            return null;
        }
    }

    /**
     * 分页查询
     */
    @GetMapping("/page/{page}/{size}")
    List<TbApplyResource> m4(@PathVariable("size") int size,@PathVariable("page")int page){
        List<TbApplyResource> tbApplyResources = applyFeign.m4(size, page);
        return tbApplyResources;
    }



    /**
     * blockHandler 只负责限流异常
     * fallback 负责运行时异常
     * 两个都配置会以blockHandler为准
     * exceptionsToIgnore 忽略异常
     */
    @GetMapping("/testA")
    @SentinelResource(value = "testA",blockHandler = "deal_testA")
    public String testA(){

        log.info("testA 测试RT");

        return applyFeign.testA();
    }

    public String deal_testA(BlockException blockException){

        log.info("deal_testA 测试RT");

        return "流量控制了applyFeign.testA()";

    }


    @GetMapping("/testB")
    public String testB(){

        return applyFeign.testB();
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2)
    {

        return "----------testHotKey";
    }

    public String deal_testHotKey(String p1,String p2,BlockException blockException)
    {
        return "----------deal_testHotKey";
    }
}
