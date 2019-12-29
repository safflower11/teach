package com.lut.teach.web.controller;

import com.lut.teach.bean.ex.ClazzEx;
import com.lut.teach.service.IClazzService;
import com.lut.teach.service.impl.ClazzServiceImpl;
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
@RequestMapping("/clazz")
@Api(description = "课程管理")
public class ClazzController {
    @Autowired
    private IClazzService iClazzService;
    @GetMapping("/selectAll")
    @ApiOperation(value = "查询所有")
    public Message selectAll(){
        List<ClazzEx> clazzExes=iClazzService.selectAll();
        return MessageUtil.success(clazzExes);
    }
}
