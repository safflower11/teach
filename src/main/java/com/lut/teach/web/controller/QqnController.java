package com.lut.teach.web.controller;

import com.lut.teach.bean.Qqn;
import com.lut.teach.bean.Question;
import com.lut.teach.bean.Questionnaire;
import com.lut.teach.bean.ex.QqnEx;
import com.lut.teach.service.IQqnService;
import com.lut.teach.service.IQuestionService;
import com.lut.teach.service.IQuestionnaireService;
import com.lut.teach.util.Message;
import com.lut.teach.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/qqn")
@Api(description = "问卷管理")
public class QqnController {
    @Autowired
    private IQqnService iQqnService;
    @Autowired
    private IQuestionnaireService iQuestionnaireService;
    @Autowired
    private IQuestionService iQuestionService;
    @GetMapping("/selectAll")
    public Message selectAll(){
        List<QqnEx> qqnExes=iQqnService.selectAll();
        return MessageUtil.success(qqnExes);
    }
    @PostMapping("/add")
    public Message add(int[] question_id,Questionnaire questionnaire){
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
        List<Qqn> qqns=iQqnService.selectById(id);
        for(Qqn qqn:qqns){
            int qid=qqn.getId();
            Qqn qqn1=iQqnService.selectBy(qid);
            int wid=qqn1.getQuestionId();
            Question question= iQuestionService.selectById(wid);
            System.out.println(question.toString());
            String question1=question.toString();
            int i=0;
            i++;
            String a[]=new String[qqns.size()];
            a[i]=question1;
        }
        return MessageUtil.success(qqns);
    }
}
