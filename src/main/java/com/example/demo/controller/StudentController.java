package com.example.demo.controller;

import com.example.demo.ioEntity.Student;
import com.example.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author ufo
 * @Date 2019/4/8 14:23
 **/
@RestController
@RequestMapping("/test")
public class StudentController {

    private static Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Resource
    private StudentService studentService;

    @PostMapping("/queryOne")
    public Map<String, Object> queryOne(String id){
        logger.info("入参：{}",id);
        return  studentService.getOne(id);
    }
    @PostMapping("/insertOne")
    public Map<String, Object> testOne(Student student){
        return  studentService.insertOne(student);
    }

    @PostMapping("/deleteOne")
    public Map<String, Object> testOne(String id){
        return  studentService.deleteOne(id);
    }

}
