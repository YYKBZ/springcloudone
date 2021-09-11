package com.my.feign.utils;

import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author Wangluoxin
 * @date 2021/9/7
 */
@Component
public class RedisUtil {


    @Autowired
    private  RedisTemplate redisTemplate;


    /**
     * set string
     */
    public  boolean setString(Object key,Object value){

        if (key!=null){
            redisTemplate.opsForValue().set(key, value,5000, TimeUnit.MILLISECONDS);
            return true;
        }else {
            return false;
        }
    }

    /**
     * get string
     */
    public  Object getString(Object key){

        if (key!=null){
            Object o = redisTemplate.opsForValue().get(key);
            return o;
        }else {
            return null;
        }
    }

    /**
     * set list
     */



    /**
     * set hash
     */
}
