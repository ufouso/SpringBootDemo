package com.example.demo.service.impl;

import com.example.demo.ioEntity.Student;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试事务
 * @Author ufo
 * @Date 2019/4/8 14:14
 **/
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Map<String, Object> getOne(String id) {
        Map<String, Object> rtnMap = new HashMap<String, Object>();
        try {
            rtnMap.put("student", studentMapper.selectByPrimaryKey(id));
        } catch (Exception e){
            e.printStackTrace();
        }
        return rtnMap;
    }

    @Override
    public Map<String, Object> insertOne(Student student) {
        Map<String, Object> rtnMap = new HashMap<String, Object>();
        try {
           int a = studentMapper.insert(student);
            rtnMap.put("resultCode",a);
        }catch (Exception e){
            e.printStackTrace();
        }
        return rtnMap;
    }

    @Override
    public Map<String, Object> deleteOne(String id) {
        Map<String, Object> rtnMap = new HashMap<String, Object>();
        try {
            int a = studentMapper.deleteByPrimaryKey(id);
            rtnMap.put("resultCode",a);
        }catch (Exception e){
            e.printStackTrace();
        }
        return rtnMap;
    }
}
