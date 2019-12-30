package com.lut.teach.web.controller;

import com.lut.teach.bean.Course;
import com.lut.teach.bean.ex.CourseEx;
import com.lut.teach.service.ICourseService;
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
@RequestMapping("/course")
@Api(description = "课程管理")
public class CourseController {
    @Autowired
    private ICourseService iCourseService;
    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有")
    public Message selectAll(){
        List<CourseEx> courseExes=iCourseService.selectAll();
        return MessageUtil.success(courseExes);
    }
    @GetMapping("/deleteById")
    @ApiOperation(value = "根据Id单个删除")
    public Message delectById(int id){
        iCourseService.delectById(id);
        return MessageUtil.success();
    }
    @PostMapping("/add")
    @ApiOperation(value = "添加课程")
    public Message add(Course course){
        iCourseService.saveOrUpdate(course);
        return MessageUtil.success();
    }
    @PostMapping("/update")
    @ApiOperation(value = "修改课程")
    public Message update(Course course){
        iCourseService.saveOrUpdate(course);
        return MessageUtil.success();
    }
    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids){
        for (int id:ids){
            iCourseService.delectById(id);
            System.out.println(id);
        }
        return MessageUtil.success();
    }
    @PostMapping("/selectNameOrDescription")
    @ApiOperation(value = "条件查询")
    public Message selectNameOrDescription(String key,String word){
        List<CourseEx> courseExes=iCourseService.search(key, word);
        return MessageUtil.success(courseExes);

    }
}
