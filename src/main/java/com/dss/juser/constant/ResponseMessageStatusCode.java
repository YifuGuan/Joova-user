package com.dss.juser.constant;

/**
 * @author 刀氏春秋
 * @date 2023/2/7
 */

public class ResponseMessageStatusCode {
    /**
     * ResponseWrapper工具类专用
     */
    public static final String WRAPPER_SUCCESS_KEY = "success";
    public static final String WRAPPER_FAILURE_KEY = "failure";

    /**
     * 状态码映射
     */
    public static final String SUCCESS = "00000：请求成功";
    public static final String LOGIN_FAIL = "10001：登录失败";
    public static final String REGISTER_FAIL = "10002：注册失败";
}
