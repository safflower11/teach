package com.lut.teach.web.controller;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.service.IResultService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classcount")
@Api(description = "班级课调分析")
public class ClasscountController {
    @Autowired
    private IResultService iResultService;
    @GetMapping("/select")
    @ApiOperation(value = "搜索")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "key1",value = "年级",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "key2",value = "班级",paramType = "query",dataType = "String"),
            @ApiImplicitParam(name = "word",value = "关键字",paramType = "query",dataType = "String")

    })
    public Message selectword(String key1,String key2,String word){
        List<ResultEx> resultExList=iResultService.fingword(key1, key2, word);
        return MessageUtil.success(resultExList);

    }
}
