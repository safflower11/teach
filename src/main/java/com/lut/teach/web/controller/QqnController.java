package com.lut.teach.web.controller;

import com.lut.teach.bean.Questionnaire;
import com.lut.teach.bean.ex.QqnEx;
import com.lut.teach.service.IQqnService;
import com.lut.teach.service.IQuestionnaireService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qqn")
public class QqnController {
    @Autowired
    private IQqnService iQqnService;
    @Autowired
    private IQuestionnaireService iQuestionnaireService;
    @GetMapping("/selectAll")
    public Message selectAll(){
        List<QqnEx> qqnExes=iQqnService.selectAll();
        return MessageUtil.success(qqnExes);
    }
    @PostMapping("/add")
    public Message add(Questionnaire questionnaire,int[] question_id){
        //iQqnService.saveOrUpdate(qqn);
        //iQuestionnaireService.saveOrUpdate(questionnaire);
      //  iQqnService.saveOrUpdate(qqn);
        System.out.println(question_id);
        System.out.println(questionnaire.getId());

        return MessageUtil.success();
    }
    @PostMapping("/add1")
    public Message addd(int[] question_id,Questionnaire questionnaire){
        iQuestionnaireService.saveOrUpdate(questionnaire);
        Questionnaire questionnaire1=iQqnService.selectmax();
        System.out.println(questionnaire1);
        for (int id:question_id){
            System.out.println(id);
            System.out.println(questionnaire1.getId());
            iQqnService.insert(id,questionnaire1.getId());
        }
        return MessageUtil.success();
    }
    @GetMapping("/selectByIdQ")
    public  Message selectByIdQ(int id){
        List<QqnEx> qqnExes=iQqnService.selectById(id);
        System.out.println(qqnExes);
        return MessageUtil.success(qqnExes);
    }
}
