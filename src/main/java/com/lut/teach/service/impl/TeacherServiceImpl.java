package com.lut.teach.service.impl;

import com.lut.teach.bean.ClazzExample;
import com.lut.teach.bean.Teacher;
import com.lut.teach.bean.TeacherExample;
import com.lut.teach.mapper.ClazzMapper;
import com.lut.teach.mapper.TeacherMapper;
import com.lut.teach.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private ClazzMapper clazzMapper;

    @Override
    public List<Teacher> findAll() throws RuntimeException {
        TeacherExample teacherExample = new TeacherExample();

        return teacherMapper.selectByExample(teacherExample);
    }

    @Override
    public void deleteById(int id) throws RuntimeException {
        teacherMapper.deleteByPrimaryKey(id);

        //ClazzExample clazzExample = new ClazzExample();
        //clazzExample.createCriteria().andTeacherIdEqualTo(id);

        //clazzMapper.deleteByExample(clazzExample);

    }

    @Override
    public Teacher findById(int id) throws RuntimeException {
        return teacherMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Teacher teacher) throws RuntimeException {
        if(teacher==null){
            throw new RuntimeException("参数空白");
        }
        if(teacher.getId()==null){
            teacherMapper.insert(teacher);
        }else {
            teacherMapper.updateByPrimaryKey(teacher);
        }
    }

    @Override
    public List<Teacher> search(String key, String word) throws RuntimeException {
        word =word==null?"":word;
        if ((key == null || "".equals(key) ) && (word == null || "".equals(word))){
            return findAll();

            // key 为空    word不为空 表示 下拉框没有选择，后面的输入框有内容
        } else if((key == null || "".equals(key)) && !"".equals(word) ) {// 前面下拉框 後面 輸入框不爲空
            //根据作者或者标题去查询
            word="%"+word+"%";
            return  teacherMapper.selectNameOrSex(word);

            // 下拉框选择了标题就根据标题查询
        } else if ("name".equals(key)) {
            word="%"+word+"%";
            return teacherMapper.selectName(word);

            // 下拉框选择了作者就根据作者查询
        } else if("gender".equals(key)) {
            word="%"+word+"%";
            return  teacherMapper.selectSex(word);
        }
        return null;
    }
}
