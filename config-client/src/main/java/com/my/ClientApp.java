package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author Wangluoxin
 * @date 2021/9/10
 *
 *
 * 用于读取config-server服务的配置文件
 *
 */
@SpringBootApplication
@RefreshScope //动态刷新
public class ClientApp {
    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class, args);
    }
}
