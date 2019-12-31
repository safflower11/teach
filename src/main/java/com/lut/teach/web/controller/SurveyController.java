package com.lut.teach.web.controller;

import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.service.ILiuyuSurveyService;
import com.lut.teach.service.ISurveyService;
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
    private ILiuyuSurveyService surveyService;

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

    @GetMapping("/shen")
    @ApiOperation(value = "判断是否审核通过")
    public Message shen(int id,Integer c){
        surveyService.insert(id,c);
        return MessageUtil.success();
    }

    @GetMapping("/findAllshen")
    @ApiOperation(value = "显示所有未审核和审核通过的")
    public Message findAllshen(){
        List<SurveyEX> allShen = surveyService.findAllShen();
        return MessageUtil.success(allShen);
    }
    @GetMapping("/findAlljian")
    @ApiOperation(value = "显示所有未启动和启动的")
    public Message findAlljian(){
        List<SurveyEX> allJian = surveyService.findAllJian();
        return MessageUtil.success(allJian);
    }

}
