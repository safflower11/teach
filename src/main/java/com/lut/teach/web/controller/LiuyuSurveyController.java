package com.lut.teach.web.controller;

import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.service.ILiuyuSurveyService;
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
@RequestMapping("/liuysurvey")
@Api(description = "ll")
public class LiuyuSurveyController {
    @Autowired
    private ILiuyuSurveyService surveyService;


    @PostMapping("/startById")
    @ApiOperation(value = "启动")
    public Message startById(int id){
        surveyService.startById(id);
        return MessageUtil.success();
    }

    @PostMapping("/endById")
    @ApiOperation(value = "终止")
    public Message endById(int id){
        surveyService.endById(id);
        return MessageUtil.success();
    }

    @GetMapping("/shenhe")
    @ApiOperation(value = "审核")
    public Message shenhe(int id){
        List<SurveyEX> surveyEXES = surveyService.shenheById(id);
        return MessageUtil.success(surveyEXES);
    }
}
