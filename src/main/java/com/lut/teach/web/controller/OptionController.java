package com.lut.teach.web.controller;

import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("选项管理")
public class OptionController {
    public Message deleteOp(int id){
        return MessageUtil.success();
    }
}
