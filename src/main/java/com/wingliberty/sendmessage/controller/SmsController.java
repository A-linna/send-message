package com.wingliberty.sendmessage.controller;

import com.wingliberty.common.dto.Result;
import com.wingliberty.sendmessage.dto.SendSms;
import com.wingliberty.sendmessage.dto.VerifySms;
import com.wingliberty.sendmessage.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aiLun
 * @date 2023/4/22-12:20
 */
@RestController()
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @PostMapping()
    public Result sendSms(@RequestBody SendSms sendSms) {
        smsService.sendSMS(sendSms.getPhone());
        return Result.success();
    }

    @PostMapping("/verify")
    public Result<Boolean> verifyCode(@RequestBody @Validated VerifySms verifySms) {
        return Result.success(smsService.verifyCode(verifySms));
    }
}
