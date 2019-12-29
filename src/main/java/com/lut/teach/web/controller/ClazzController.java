package com.lut.teach.web.controller;

import com.lut.teach.bean.Clazz;
import com.lut.teach.bean.ex.ClazzEx;
import com.lut.teach.service.IClazzService;
import com.lut.teach.service.impl.ClazzServiceImpl;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clazz")
@Api(description = "班级管理")
public class ClazzController {
    @Autowired
    private IClazzService iClazzService;
    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有")
    public Message selectAll(){
        List<ClazzEx> clazzExes=iClazzService.selectAll();
        return MessageUtil.success(clazzExes);
    }
    @GetMapping("/deleteById")
    @ApiOperation(value = "根据Id单个删除")
    public Message delectById(int id){
        iClazzService.delectById(id);
        return MessageUtil.success();
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加班级")
    public Message add(Clazz clazz){
        iClazzService.saveOrUpdate(clazz);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改班级")
    public Message update(Clazz clazz){
        iClazzService.saveOrUpdate(clazz);
        return MessageUtil.success();
    }
    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids){
        for (int id:ids){
            iClazzService.delectById(id);
            System.out.println(id);
        }
        return MessageUtil.success();
    }
    @PostMapping("/selectNameOrDescription")
    @ApiOperation(value = "条件查询")
    public Message selectNameOrDescription(String key,String word){
        List<ClazzEx> clazzExes=iClazzService.search(key, word);
        return MessageUtil.success(clazzExes);

    }
}
