package com.lut.teach.web.controller;

import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.service.ILiuyuSurveyService;
import com.lut.teach.service.ISurveyService;
import com.lut.teach.service.RSurveyService;
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
@Api(description = "课调管理")
@RequestMapping("/Survey")
public class SurveyController {
    @Autowired
    private ISurveyService iSurveyService;


    @Autowired
    private RSurveyService rSurveyService;

    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有课调信息")
    public Message findAll(){
        List<SurveyEX> lists=iSurveyService.findAll();
        return MessageUtil.success(lists);
    }
    @GetMapping("/showById")
    @ApiOperation(value = "预览")
    public Message showById(int id){
        List<SurveyEX> lists=iSurveyService.showById(id);
        return MessageUtil.success(lists);
    }



    @ApiOperation(value = "添加课调")
    @PostMapping("/add")
    public Message add(int departid,int classid,int courseid,int questionid,int teachid,Integer code){
        rSurveyService.insert(departid,classid,courseid,questionid,teachid,code);
        System.out.println(code);
        return MessageUtil.success();
    }
    @ApiOperation(value = "修改课调")
    @PostMapping("/update")
    public Message update(int id,int departid,int classid,int courseid,int questionid,int teachid,Integer code) {
        rSurveyService.update(id, departid, classid, courseid, questionid, teachid, code);
        return MessageUtil.success();
    }

}
