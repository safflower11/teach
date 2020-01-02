package com.lut.teach.service.impl;

import com.lut.teach.bean.ex.ResultEx;
import com.lut.teach.mapper.ex.ResultExMapper;
import com.lut.teach.service.IResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ResultServiceImpl implements IResultService {
    @Autowired
    private ResultExMapper resultExMapper;
    @Override
    public List<ResultEx> findBy(String word) throws RuntimeException {
        List<ResultEx> resultExes=resultExMapper.selectByWord(word);
        return resultExes;
    }

    @Override
    public List<ResultEx> fingword(String key1,String key2, String word) throws RuntimeException {
        word = word == null ? "" : word;
        key1 = key1 == null ? "" : key1;
        key2 = key2 == null ? "" : key2;
        if ((key1 == null || "".equals(key1)) &&(key2 == null || "".equals(key2))&& word == null || "".equals(word)) {
            return findAll();
        }else if ((key1 == null || "".equals(key1)) && (key2 == null || "".equals(key2))&& !"".equals(word)){//前面下拉框为空，后面不为空

            word = "%" + word  + "%";
            key1 = "%" + key1  + "%";
            key2 = "%" + key2  + "%";
            List<ResultEx> resultExes=resultExMapper.selectword(word);
            return resultExes;

        }else if(!"".equals(key1) && (key2 == null || "".equals(key2))&& !"".equals(word)){
            word = "%" + word  + "%";
            key1 = "%" + key1  + "%";
            key2 = "%" + key2  + "%";
            System.out.println(word);
            List<ResultEx> resultExes=resultExMapper.selectdepartword(key1,word);
            return resultExes;

        }else if(!"".equals(key2) && (key1 == null || "".equals(key1))&& !"".equals(word)){
            word = "%" + word  + "%";
            key1 = "%" + key1  + "%";
            key2 = "%" + key2  + "%";
            System.out.println(word);
            List<ResultEx> resultExes=resultExMapper.selectclassword(key2,word);
            return resultExes;
        }else if(!"".equals(key1) && (key2 == null || "".equals(key2))&& word == null || "".equals(word)) {
            word = "%" + word + "%";
            key1 = "%" + key1  + "%";
            key2 = "%" + key2  + "%";
            System.out.println(word);
            List<ResultEx> resultExes = resultExMapper.selectdepart(key1);
            return resultExes;
        }else if(!"".equals(key2) && (key1 == null || "".equals(key1))&& word == null || "".equals(word)) {
            word = "%" + word + "%";
            key1 = "%" + key1  + "%";
            key2 = "%" + key2  + "%";
            System.out.println(word);
            List<ResultEx> resultExes = resultExMapper.selectclass(key2);
            return resultExes;
        }
        return null;
    }

    @Override
    public List<ResultEx> findAll() throws RuntimeException {
        List<ResultEx> resultExes=resultExMapper.findAllSurvey();
        return resultExes;
    }
}

