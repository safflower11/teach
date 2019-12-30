package com.lut.teach.service.impl;

import com.lut.teach.bean.Qqn;
import com.lut.teach.bean.Questionnaire;
import com.lut.teach.bean.ex.QqnEx;
import com.lut.teach.mapper.QqnMapper;
import com.lut.teach.mapper.ex.QqnExMapper;
import com.lut.teach.service.IQqnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QqnServiceImpl implements IQqnService {
    @Autowired
    private QqnExMapper qqnExMapper;
    @Autowired
    private QqnMapper qqnMapper;
    @Override
    public List<QqnEx> selectAll() throws RuntimeException {
        List<QqnEx> qqnExes=qqnExMapper.selectAll();
        return qqnExes;
    }

    @Override
    public void saveOrUpdate(Qqn qqn) throws RuntimeException {
        if(qqn==null){
            throw new RuntimeException("参数错误");
        }if(qqn.getId()==null){
           qqnMapper.insert(qqn);
        }else{
            qqnMapper.updateByPrimaryKey(qqn);
        }
    }

    @Override
    public void insert(int qid,int qqid) throws RuntimeException {
        Qqn qqn = new Qqn();
        qqn.setQuestionId(qid);
        qqn.setQuestionnaireId(qqid);
        qqnMapper.insert(qqn);
    }

    @Override
    public Questionnaire selectmax() throws RuntimeException {
        Questionnaire questionnaire=qqnExMapper.selectmax();
        return questionnaire;
    }

    @Override
    public List<QqnEx> selectById(int id) throws RuntimeException {
        List<QqnEx> qqnExes=qqnExMapper.selectByQuId();
        return qqnExes;
    }


}
