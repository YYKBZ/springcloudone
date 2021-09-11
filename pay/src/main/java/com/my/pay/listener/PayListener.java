package com.my.pay.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Wangluoxin
 * @date 2021/9/7
 */
@Component
public class PayListener {

    @RabbitListener(queues = "payqueue")
    public void m1(Object s){
        System.out.println("接收到订单通知"+s);
    }
}
