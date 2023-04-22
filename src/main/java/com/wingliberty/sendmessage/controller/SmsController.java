package com.wingliberty.sendmessage.controller;

import com.wingliberty.common.dto.Result;
import com.wingliberty.sendmessage.dto.SendSms;
import com.wingliberty.sendmessage.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
}
