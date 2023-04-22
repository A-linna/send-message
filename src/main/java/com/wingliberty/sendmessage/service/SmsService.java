package com.wingliberty.sendmessage.service;

import com.wingliberty.sendmessage.dto.VerifySms;

/**
 * 短信
 *
 * @author aiLun
 * @date 2023/4/22-13:27
 */
public interface SmsService {

    /**
     * 发送手机短信
     *
     * @param phone
     */
    void sendSMS(String phone);

    boolean verifyCode(VerifySms verifySms);
}
