package com.lut.teach.web.controller;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.service.IResultService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/select")
@Api(description ="搜索")
public class ResultController {
    @Autowired
    private IResultService iResultService;
    @GetMapping("/select")
    public Message selectBy(String word){
       List<ResultEx> resultExList= iResultService.findBy(word);
       return MessageUtil.success(resultExList);
    }

}
