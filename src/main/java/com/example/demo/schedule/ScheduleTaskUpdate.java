package com.example.demo.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 *
 * 定时任务动态修改执行时间
 * @Author ufo
 * @Date 2019/4/3 10:20
 **/
@Component
//@EnableScheduling
public class ScheduleTaskUpdate implements SchedulingConfigurer {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleTaskUpdate.class);

    private String cron = "0/2 * * * * ?";

    @Override
    public void configureTasks(ScheduledTaskRegistrar str){
        str.addTriggerTask(new Runnable() {
                               @Override
                               public void run() {
                                   //需要实现的任务逻辑
                                   logger.info("-------start--------");
                                   logger.info("-------cron时间表达式"+cron);
                                   logger.info("-------当前时间："+System.currentTimeMillis());
                                   logger.info("-------end--------");
                               }
                           }, new Trigger() {
                                //任务触发，可修改任务的执行周期
                               @Override
                               public Date nextExecutionTime(TriggerContext triggerContext) {
                                   CronTrigger ct = new CronTrigger(cron);
                                   Date date = ct.nextExecutionTime(triggerContext);
                                   return date;
                               }
                           }
        );
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron;
    }
}

