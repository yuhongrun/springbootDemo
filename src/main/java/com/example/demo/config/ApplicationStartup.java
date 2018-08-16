package com.example.demo.config;

/**
 * @author hongrun.yu
 * @date 2018-08-15 17:20
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationContextEvent;

@Slf4j
@Configuration
public class ApplicationStartup implements ApplicationListener<ApplicationContextEvent>{

    @Value(value ="${server.port}")
    public String port;

    @Value(value ="${server.path}")
    public String localhost;


    @Override
    public void onApplicationEvent(ApplicationContextEvent event) {
        log.warn(localhost+":"+port);
    }

}