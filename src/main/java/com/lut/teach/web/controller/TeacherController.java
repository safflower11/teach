package com.lut.teach.web.controller;

import com.lut.teach.bean.Teacher;
import com.lut.teach.service.ITeacherService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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


}
