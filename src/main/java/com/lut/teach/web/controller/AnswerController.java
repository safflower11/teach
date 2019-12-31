package com.lut.teach.web.controller;

import com.lut.teach.bean.Answer;
import com.lut.teach.service.IAnswerServiceImpl;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answer")
@Api(description ="问题")
public class AnswerController {
    @Autowired
    private IAnswerServiceImpl iAnswerService;
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
}
