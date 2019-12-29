package com.lut.teach.web.controller;

import com.lut.teach.bean.Teacher;
import com.lut.teach.service.ITeacherService;
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
@RequestMapping("/teacher")
@Api(description = "教师管理")
public class TeacherController {
    @Autowired
    private ITeacherService teacherService;



    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有")
    public Message findAll(){
        List<Teacher> teachers = teacherService.findAll();
        return MessageUtil.success(teachers);
    }

    @GetMapping("/deleteById")
    @ApiOperation(value = "按照id删除")
    public Message deleteById(int id){
        teacherService.deleteById(id);

        return MessageUtil.success("删除成功");
    }

    @GetMapping("/findById")
    @ApiOperation(value = "按照id查询")
    public Message findById(int id){
        Teacher teacher = teacherService.findById(id);
        return MessageUtil.success(teacher);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加教师")
    public Message insert(Teacher teacher){
        teacherService.saveOrUpdate(teacher);
        return MessageUtil.success("添加成功");
    }

    @PostMapping("/update")
    @ApiOperation(value = "添加教师")
    public Message update(Teacher teacher){
        teacherService.saveOrUpdate(teacher);
        return MessageUtil.success("修改成功");
    }

    @GetMapping("/search")
    public Message search(String key,String word){
        List<Teacher> search = teacherService.search(key, word);
        return MessageUtil.success(search);
    }
}
