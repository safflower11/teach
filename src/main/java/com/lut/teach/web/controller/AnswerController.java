package com.lut.teach.web.controller;

import com.lut.teach.bean.Answer;
import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.service.IAnswerServiceImpl;
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
@RequestMapping("/answer")
@Api(description ="课调审核")
public class AnswerController {
    @Autowired
    private IAnswerServiceImpl iAnswerService;
    @Autowired
    private ILiuyuSurveyService surveyService;
    @ApiOperation(value = "删除回答")
    @PostMapping("/delete")
    public Message delete(int id){
        iAnswerService.deleteById(id);
        return MessageUtil.success();
    }
    @ApiOperation(value = "修改回答")
    @GetMapping("/update")
    public Message update(Answer answer){
        iAnswerService.update(answer);
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
}
