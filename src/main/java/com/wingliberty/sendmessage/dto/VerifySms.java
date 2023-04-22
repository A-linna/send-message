package com.wingliberty.sendmessage.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author aiLun
 * @date 2023/4/22-15:52
 */

@Data
public class VerifySms {
    @NotBlank(message = "手机号不能为空")
    private String phone;
    /**
     * 验证吗
     */
    @NotBlank(message = "验证码不能为空")
    private String code;

}
