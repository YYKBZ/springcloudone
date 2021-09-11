package com.my.user.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.my.user.entity.TbApplyResource;
import com.my.user.service.ITbApplyResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author WangLuoXin
 * @since 2021-09-06
 */
@Controller
@RequestMapping("/tbApplyResource")
public class TbApplyResourceController {

    @Autowired
    private ITbApplyResourceService tbApplyResourceService;


    /**
     * 查询所有订单
     */
    @GetMapping("/all")
    @ResponseBody
    public List<TbApplyResource> m1(){
        List<TbApplyResource> list = tbApplyResourceService.list();
        return list;
    }

    /**
     * 查询applyID小于50所有订单
     */
    @GetMapping("/all50")
    @ResponseBody
    public List<TbApplyResource> m2(){
        List<TbApplyResource> list = tbApplyResourceService.selectId();
        return list;
    }
    /**
     * 查询指定id的
     */
    @GetMapping("/by/{id}")
    @ResponseBody
    public TbApplyResource m3(@PathVariable("id") Long id){
        TbApplyResource tbApplyResource = tbApplyResourceService.byId(id);
        return tbApplyResource;
    }

    /**
     * 分页查询
     */
    @GetMapping("/page/{page}/{size}")
    @ResponseBody
    public List<TbApplyResource> m4(@PathVariable("size") int size,@PathVariable("page")int page){
        Page page1=new Page(page,size);
        Page page2 = tbApplyResourceService.page(page1);
        List records = page2.getRecords();
        return records;
    }

    @GetMapping("/testA")
    @ResponseBody
    public String testA(){
        return "-----------------testA";
    }

    @GetMapping("/testB")
    @ResponseBody
    public String testB(){
        return "-----------------testB";
    }
}

