package com.lut.teach.service.impl;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.bean.ex.SurveyEX;
import com.lut.teach.mapper.ex.AllSurveyMapper;
import com.lut.teach.mapper.ex.LiuyuEXMapper;
import com.lut.teach.service.IAllSurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AllSurveyServiceImpl implements IAllSurveyService {
    @Autowired
    private AllSurveyMapper allSurveyMapper;
    @Autowired
    private LiuyuEXMapper liuyuEXMapper;


    @Override
    public List<SurveyEX> findAll() throws RuntimeException {
        return liuyuEXMapper.findAllAll();
    }

    @Override
    public List<SurveyEX> search(String key1, String key2, String key3, String key4, String word) throws RuntimeException {
        word =word==null?"":word;

        if(key1==null||"".equals(key1)){
            key1="%%";
        }
        if(key2==null||"".equals(key2)){
            key2="%%";
        }
        if(key3==null||"".equals(key3)){
            key3="%%";
        }
        if(key4==null||"".equals(key4)){
            key4="%%";
        }

        /*if ((key1 == null || "".equals(key1) ) &&(key2 == null || "".equals(key2) )
                &&(key3 == null || "".equals(key3) ) &&(key4 == null || "".equals(key4) )
                && (word == null || "".equals(word))){
            return findAll();

        } else {*/
            //根据年级或者班级或课程或问卷去查询
            word="%"+word+"%";
            return  liuyuEXMapper.selectDCCQ(word);




        /*else if ("年级".equals(key1)) {
            word="%"+word+"%";
            return allSurveyMapper.selectDepart(word);

            // 下拉框选择了班级
        } else if("班级".equals(key2)) {
            word="%"+word+"%";
            return  allSurveyMapper.selectClazz(word);
            // 下拉框选择了课程
        }else if("课程".equals(key3)) {
            word="%"+word+"%";
            return  allSurveyMapper.selectCourse(word);
        }
            //下拉框选择了问卷
        else if("问卷".equals(key4)) {
            word="%"+word+"%";
            return  allSurveyMapper.selectQusetionnaire(word);
        }*/
       // return null;
    }
}
