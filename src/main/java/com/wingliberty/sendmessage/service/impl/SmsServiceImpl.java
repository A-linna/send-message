package com.wingliberty.sendmessage.service.impl;

import com.wingliberty.common.Utils.RandomUtils;
import com.wingliberty.common.Utils.RegexUtils;
import com.wingliberty.sendmessage.constant.CacheKey;
import com.wingliberty.sendmessage.service.CacheService;
import com.wingliberty.sendmessage.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aiLun
 * @date 2023/4/22-13:27
 */

@Service
public class SmsServiceImpl implements SmsService {
    @Autowired
    private CacheService cacheService;

    @Override
    public void sendSMS(String phone) {
        boolean mobile = RegexUtils.isMobile(phone);
        if (!mobile) {

        }

        String key = CacheKey.buildKey(CacheKey.SEND_SMS, phone);
        //todo 需要做接口防刷
        /*String value = cacheService.get(key);*/

        String randomNumber = RandomUtils.randomNumber(6);
        //todo 对接短信发送
        cacheService.set(key, randomNumber, 90);

    }
}
