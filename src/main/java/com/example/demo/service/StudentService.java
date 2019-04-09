package com.example.demo.service;

import com.example.demo.ioEntity.Student;

import java.util.Map;

/**
 * @Author ufo
 * @Date 2019/4/8 14:14
 **/
public interface StudentService {

    /**
     * 查询一个
     * @return
     */
    public Map<String, Object> getOne(String id);

    /**
     * 插入一个
     * @param student
     * @return
     */
    public Map<String, Object> insertOne(Student student);

    /**
     * 删除一个
     * @param id
     * @return
     */
    public Map<String, Object> deleteOne(String id);
}
