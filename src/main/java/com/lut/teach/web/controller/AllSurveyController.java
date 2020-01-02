package com.lut.teach.web.controller;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.service.IAllSurveyService;
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
@RequestMapping("/allsurvey")
@Api(description = "全部课调")
public class AllSurveyController {

    @Autowired
    private IAllSurveyService allSurveyService;

    @GetMapping("/search")
    @ApiOperation(value = "搜索")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "key1",value = "年级",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "key2",value = "班级",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "key3",value = "课程",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "key4",value = "问卷",paramType = "query",dataType = "String"),
                    @ApiImplicitParam(name = "word",value = "关键字",paramType = "query",dataType = "String")
            }
    )
    public Message search(String key1,String key2,String key3, String key4, String word){
        List<SurveyEX> search = allSurveyService.search(key1, key2, key3, key4, word);
        return MessageUtil.success(search);
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "显示所有")
    public Message findAll(){
        List<SurveyEX> search = allSurveyService.findAll();
        return MessageUtil.success(search);
    }
    @GetMapping("/show")
    @ApiOperation(value = "预览")
    public Message show(int id){
        List<SurveyEX> surveyEXES = allSurveyService.showById(id);
        for(SurveyEX surveyEX:surveyEXES){
            if("审核通过".equals(surveyEX.getStatus())){
                return MessageUtil.success(surveyEX);
            }else {
                return MessageUtil.success();
            }
        }
        return MessageUtil.success();
    }

}
