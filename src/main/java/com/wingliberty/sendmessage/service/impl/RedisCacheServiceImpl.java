package com.wingliberty.sendmessage.service.impl;

import com.wingliberty.sendmessage.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * 缓存服务
 *
 * @author aiLun
 * @date 2023/4/22-13:29
 */
@Service
public class RedisCacheServiceImpl implements CacheService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public void set(String key, String value,long e) {
        redisTemplate.opsForValue().set(key, value, e, TimeUnit.SECONDS);
    }

    @Override
    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
