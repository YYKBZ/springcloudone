package com.my.pay.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wangluoxin
 * @date 2021/9/7
 */
@Configuration
public class RabbitMQConfig {


    /**
     * 声明队列
     */
    @Bean
    public Queue pay(){
        return new Queue("payqueue");
    }

    /**
     * 声明交换机
     */
    @Bean
    public FanoutExchange payExchange(){

        return new FanoutExchange("payExchange",true,false);
    }

    /**
     * 绑定
     */
    @Bean
    public Binding binding(){
        return BindingBuilder.bind(pay()).to(payExchange());
    }
}

