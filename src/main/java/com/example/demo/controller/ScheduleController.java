package com.example.demo.controller;

import com.example.demo.schedule.ScheduleTaskUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Author ufo
 * @Date 2019/4/3 12:54
 **/
@RestController
@RequestMapping("/change")
public class ScheduleController {

    @Autowired
    private ScheduleTaskUpdate scheduleTaskUpdate;

    @RequestMapping("/updateCron")
    public Map<String, Object> updateCron(String cron){
        scheduleTaskUpdate.setCron(cron);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("resultMsg","success");
        return map;
    }


}
