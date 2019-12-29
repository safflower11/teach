package com.lut.teach.service.impl;

import com.lut.teach.bean.Clazz;
import com.lut.teach.bean.ClazzExample;
import com.lut.teach.bean.ex.ClazzEx;
import com.lut.teach.mapper.ClazzMapper;
import com.lut.teach.mapper.ex.ClazzExMapper;
import com.lut.teach.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClazzServiceImpl implements IClazzService {
    @Autowired
    private ClazzExMapper clazzExMapper;
    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public List<ClazzEx> selectAll() throws RuntimeException {
        List<ClazzEx> clazzExes= clazzExMapper.selectAll();
        return clazzExes;
    }

    @Override
    public void delectById(int id) throws RuntimeException {
        clazzMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void saveOrUpdate(Clazz clazz) throws RuntimeException {
        if(clazz==null){
            throw new RuntimeException("参数错误");
        }
        if(clazz.getId()==null){
            clazzMapper.insert(clazz);
        }else {
            clazzMapper.updateByPrimaryKey(clazz);
        }

    }

    @Override
    public List<ClazzEx> search(String key, String word) throws RuntimeException {
        word = word == null ? "" : word;
        if ((key == null || "".equals(key)) && word == null || "".equals(word)) {
            return selectAll();
        }else if ((key == null || "".equals(key)) && !"".equals(word)){//前面下拉框为空，后面不为空

            word = "%" + word  + "%";
            List<ClazzEx> clazzExes=clazzExMapper.selectNameOrDescription(word);
            return clazzExes;

        }else if("name".equals(key)){
            word = "%" + word  + "%";
            System.out.println(word);
            List<ClazzEx> clazzExes=clazzExMapper.selectName(word);
            return clazzExes;

        }else if("description".equals(key)){
            word = "%" + word  + "%";
            List<ClazzEx> clazzExes=clazzExMapper.selectDescription(word);
            return clazzExes;
        }
        return null;
    }


}
