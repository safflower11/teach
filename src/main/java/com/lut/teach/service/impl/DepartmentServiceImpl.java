package com.lut.teach.service.impl;

import com.lut.teach.bean.Department;
import com.lut.teach.bean.ex.DepartmentEX;
import com.lut.teach.bean.ex.DepartmentExample;
import com.lut.teach.mapper.DepartmentMapper;
import com.lut.teach.mapper.ex.DepartmentEXMapper;
import com.lut.teach.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements IDepartmentService {
    @Autowired
    private DepartmentEXMapper departmentEXMapper;
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<DepartmentEX> findAlldepartment() throws RuntimeException {
        List<DepartmentEX> lists=departmentEXMapper.findAll();
        return lists;

    }

    @Override
    public List<DepartmentEX> search(String kay, String word) throws RuntimeException {
        word = word== null ? "" :word;
        if ((kay == null || "".equals(kay) ) && (word == null || "".equals(word))){
            return findAlldepartment();
        }else if((kay==null || "".equals(kay)) && !"".equals(word)){
            word="%" + word +"%";
            departmentEXMapper.selectIdOrName(word);
        }else if ("id".equals(kay)){
            word="%" + word +"%";
            departmentEXMapper.selectId(word);
        }else if ("name".equals(kay)){
            word="%" + word +"%";
            departmentEXMapper.selectName(word);
        }
        return null;
    }

    @Override
    public void deletedepartmentById(int id) throws RuntimeException {
        departmentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdatedepartment(Department department) throws RuntimeException {
        if(department == null){
            throw new RuntimeException("参数为空！");
        }else if(department.getId()==null){
            departmentMapper.insert(department);
        }else {
            departmentMapper.updateByPrimaryKey(department);
        }

    }
}
