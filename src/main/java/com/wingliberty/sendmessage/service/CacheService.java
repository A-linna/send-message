package com.wingliberty.sendmessage.service;

/**
 * @author aiLun
 * @date 2023/4/22-13:29
 */
public interface CacheService {

    /**
     * k-v缓存
     *
     * @param key
     * @param value
     * @param duration 存储时间，单位秒
     */
    void set(String key, String value,long duration);

    /**
     * k-v 查询
     * @param key
     */
    String get(String key);
}
