package com.dss.juser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 刀氏春秋
 * @date 2023/1/30
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.dss.juser.mapper")
public class JoovaCourseApplication {
    public static void main(String[] args) {
        SpringApplication.run(JoovaCourseApplication.class, args);
    }
}
