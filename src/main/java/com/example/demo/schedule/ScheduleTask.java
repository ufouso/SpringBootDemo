package com.example.demo.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 这种使用的是SpringTask,无法实现动态修改定时任务的时间设置
 * 定时任务,如果想要让当前类中的所有定时任务都各自，在自己的线程中执行的话，
 * 那么就需要添加异步执行注解，需要在Application中添加@EnableAsync//开启异步，
 * 然后在各自的方法上面添加@Async中启动各自的异步线程。
 * @Author ufo
 * @Date 2019/4/3 10:20
 **/
@Component
public class ScheduleTask {

    private static final Logger logger = LoggerFactory.getLogger(ScheduleTask.class);

    @Async
    @Scheduled(fixedRate = 5000)
    public void logTime1(){
        logger.info("定时任务1，当前时间："+System.currentTimeMillis());
    }

    @Async
    @Scheduled(fixedRate = 5000)
    public void logTime2(){
        logger.info("定时任务2，当前时间："+System.currentTimeMillis());
    }

    @Async
    @Scheduled(cron = "0/2 * * * * ? ")
    public void logTime3(){
        logger.info("定时任务3，当前时间："+System.currentTimeMillis());
    }

    public static void main(String[] args) {

    }
}

