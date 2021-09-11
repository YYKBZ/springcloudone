package com.my.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author Wangluoxin
 * @date 2021/9/8
 */
//@Order(-1)
@Component
public class IpFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println(exchange.getRequest().getURI().getHost());
        if (true){
            //通过请求
            return chain.filter(exchange);
        }else {
            //通常还设置状态码
            //拦截请求
            return exchange.getResponse().setComplete();
        }

    }

    @Override
    public int getOrder() {
        return 1;
    }
}
