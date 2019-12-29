package com.lut.teach.web.controller;

import com.lut.teach.bean.Questionnaire;
import com.lut.teach.bean.Teacher;
import com.lut.teach.service.IQuestionnaireService;
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
@RequestMapping("/questionnair")
@Api(description = "问卷管理")
public class QuestionnairController {
    @Autowired
    private IQuestionnaireService questionnaireService;



    @GetMapping("/findAll")
    @ApiOperation(value = "查询所有")
    public Message findAll(){
        List<Questionnaire> teachers = questionnaireService.findAll();
        return MessageUtil.success(teachers);
    }

    @GetMapping("/deleteById")
    @ApiOperation(value = "按照id删除")
    public Message deleteById(int id){
        questionnaireService.deleteById(id);

        return MessageUtil.success("删除成功");
    }

    @GetMapping("/findById")
    @ApiOperation(value = "按照id查询")
    public Message findById(int id){
        Questionnaire byId = questionnaireService.findById(id);
        return MessageUtil.success(byId);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加教师")
    public Message insert(Questionnaire questionnaire){
        questionnaireService.saveOrUpdate(questionnaire);
        return MessageUtil.success("添加成功");
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改教师")
    public Message update(Questionnaire questionnaire){
        questionnaireService.saveOrUpdate(questionnaire);
        return MessageUtil.success("修改成功");
    }

    @GetMapping("/search")
    public Message search(String word){
        List<Questionnaire> search = questionnaireService.search(word);
        return MessageUtil.success(search);
    }
    @GetMapping("/deleteBatch")
    public Message deleteBatch(int[] ids){
        for(int id:ids){
            questionnaireService.deleteById(id);
        }
        return MessageUtil.success();
    }

}
