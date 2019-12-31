package com.lut.teach.web.controller;

import com.lut.teach.service.VSurveyService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vsurvey")
public class VSurveyController {
    @Autowired
    private VSurveyService vSurveyService;
    @GetMapping("/deleteById")
    @ApiOperation(value = "根据Id单个删除")
    public Message delectById(int id){
        vSurveyService.delectById(id);
        return MessageUtil.success();
    }
    @GetMapping("/deleteBatch")
    @ApiOperation(value = "批量删除")
    public Message deleteBatch(int[] ids){
        for (int id:ids){
            vSurveyService.delectById(id);
            System.out.println(id);
        }
        return MessageUtil.success();
    }

}
