package com.lut.teach.web.controller;

import com.lut.teach.bean.Department;
import com.lut.teach.bean.ex.DepartmentEX;
import com.lut.teach.service.IDepartmentService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Department")
@Api(description = "/年级管理")
public class DepartmentController {
    @Autowired
    private IDepartmentService iDepartmentService;

    @GetMapping("/deletedepartment")
    @ApiOperation(value="根据id删除班级信息")
    public Message deteledepartment(int id){
        iDepartmentService.deletedepartmentById(id);
        return MessageUtil.success();

    }
    @GetMapping("/findalldepartment")
    @ApiOperation(value="查询所有班级信息")
    public Message findall(){
       List<DepartmentEX> lists= iDepartmentService.findAlldepartment();
        return MessageUtil.success(lists);
    }


    @GetMapping("/select")
    @ApiOperation(value="根据id或者name查询班级信息")
    public Message search(String kay,String word){
        List<DepartmentEX> lists=iDepartmentService.search(kay,word);
        return MessageUtil.success(lists);

    }

    @PostMapping("/add")
    @ApiOperation(value = "添加班级信息")
    public Message add(){
        Department department = new Department();
        iDepartmentService.saveOrUpdatedepartment(department);
        return MessageUtil.success();
    }




}
