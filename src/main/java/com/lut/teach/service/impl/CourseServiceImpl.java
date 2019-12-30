package com.lut.teach.service.impl;

import com.lut.teach.bean.Course;
import com.lut.teach.bean.ex.CourseEx;
import com.lut.teach.mapper.CourseMapper;
import com.lut.teach.mapper.ex.CourseExMapper;
import com.lut.teach.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService {
    @Autowired
    private CourseExMapper courseExMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<CourseEx> selectAll() throws RuntimeException {
        List<CourseEx> courseExes = courseExMapper.selectAll();
        return courseExes;
    }

    @Override
    public void delectById(int id) throws RuntimeException {
        courseMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Course course) throws RuntimeException {
        if (course==null){
            throw new RuntimeException("参数错误");
        }
        if(course.getId()==null){
            courseMapper.insert(course);
        }else {
            courseMapper.updateByPrimaryKey(course);
        }

    }

    @Override
    public List<CourseEx> search(String key, String word) throws RuntimeException {
        word = word == null ? "" : word;
        if ((key == null || "".equals(key)) && word == null || "".equals(word)) {
            return selectAll();
        }else if ((key == null || "".equals(key)) && !"".equals(word)){//前面下拉框为空，后面不为空

            word = "%" + word  + "%";
            List<CourseEx> courseExes=courseExMapper.selectNameOrDescription(word);
            return courseExes;

        }else if("name".equals(key)){
            word = "%" + word  + "%";
            System.out.println(word);
            List<CourseEx> courseExes=courseExMapper.selectName(word);
            return courseExes;

        }else if("description".equals(key)){
            word = "%" + word  + "%";
            List<CourseEx> courseExes=courseExMapper.selectDescription(word);
            return courseExes;
        }
        return null;
    }
}
