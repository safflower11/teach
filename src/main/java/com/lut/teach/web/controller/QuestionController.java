package com.lut.teach.web.controller;
import com.lut.teach.bean.Options;
import com.lut.teach.bean.Question;
import com.lut.teach.bean.ex.QuestionEX;
import com.lut.teach.service.IQuestionService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Question")
@Api(description = "问卷管理")
public class QuestionController {
    @Autowired
    private IQuestionService iQuestionService;
    @GetMapping("/deleteById")
    @ApiOperation(value="根据id删除问卷")
    public Message deletequestion(int id){
        iQuestionService.deleteQById(id);
        return MessageUtil.success();

    }

    @GetMapping("/findall")
    @ApiOperation(value="查询所有问卷信息")
    public Message findAll(){
        List<QuestionEX> lists= iQuestionService.findAll();
        return MessageUtil.success(lists);
    }

    @GetMapping("/selectNameOrType")
    @ApiOperation(value="根据name或者type查询问卷信息")
    public Message search(String kay,String word){
        List<QuestionEX> lists=iQuestionService.search(word);
        return MessageUtil.success(lists);

    }

    @PostMapping("/add")
    @ApiOperation(value = "添加问卷信息")

    public Message add(Question question, @RequestBody Options options){
        iQuestionService.saveOrUpdate(question);

        return MessageUtil.success();
    }

    @GetMapping("/deleteall")
    @ApiOperation(value = "根据id删除所有问卷信息")
    public Message delete(int[] ids){
        for(int id : ids){
            iQuestionService.deleteQById(id);
        }
        return MessageUtil.success();
    }


    @PostMapping("/update")
    @ApiOperation(value = "修改问卷信息")
    public Message update(Question question,@RequestBody Options option){
        iQuestionService.saveOrUpdate(question);
        return MessageUtil.success();
    }





}
