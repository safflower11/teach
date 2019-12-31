package com.lut.teach.web.controller;

import com.lut.teach.service.RSurveyService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Rsurvey")
@Api(description = "课调管理")
public class RSurveyController {
    @Autowired
    private RSurveyService rSurveyService;
    @ApiOperation(value = "添加")
    @PostMapping("/add")
    public Message add(int departid,int classid,int courseid,int questionid,int teachid,int code){
        rSurveyService.insert(departid,classid,courseid,questionid,teachid,code);
        System.out.println(departid);
        System.out.println(classid);
        return MessageUtil.success();
    }
    @ApiOperation(value = "修改")
    @PostMapping("/update")
    public Message update(int id,int departid,int classid,int courseid,int questionid,int teachid,int code){
        rSurveyService.update(id,departid,classid,courseid,questionid,teachid,code);
        System.out.println(id);
        return MessageUtil.success();
    }
}
