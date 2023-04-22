package com.wingliberty.sendmessage.constant;

import java.util.Objects;

/**
 * 缓存key
 *
 * @author aiLun
 * @date 2023/4/22-13:50
 */
public enum CacheKey {
    SEND_SMS("发送手机短信"),
    ;
    final String desc;

    private static final String APP_PREFIX = "message-";

    CacheKey(String desc) {
        this.desc = desc;
    }

    public static String buildKey(CacheKey prefix, String... args) {
        StringBuilder sb = new StringBuilder();
        sb.append(APP_PREFIX);
        sb.append(prefix.name());
        if (Objects.nonNull(args)) {
            sb.append("-");
            for (String arg : args) {
                sb.append(arg).append("-");
            }
            sb.deleteCharAt(sb.length()-1);
        }

        return sb.toString();
    }

    public static String buildKey(CacheKey prefix) {
        return APP_PREFIX + prefix;
    }

}
