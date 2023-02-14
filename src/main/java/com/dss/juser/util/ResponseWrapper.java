package com.dss.juser.util;

import com.dss.juser.constant.ResponseMessageStatusCode;
import com.dss.juser.pojo.response.CommonResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 刀氏春秋
 * @date 2023/2/14
 */
public class ResponseWrapper<T> {
    /**
     * 执行状态码
     */
    private final Map<String, String> messages = new HashMap<>();

    public ResponseWrapper() {
        messages.put(ResponseMessageStatusCode.WRAPPER_SUCCESS_KEY, "成功状态码未指配");
        messages.put(ResponseMessageStatusCode.WRAPPER_FAILURE_KEY, "失败状态码未指配");
    }

    public ResponseWrapper(String success, String failure) {
        messages.put(ResponseMessageStatusCode.WRAPPER_SUCCESS_KEY, success);
        messages.put(ResponseMessageStatusCode.WRAPPER_FAILURE_KEY, failure);
    }

    public void setSuccessAndFailureMessages(String success, String failure) {
        messages.put(ResponseMessageStatusCode.WRAPPER_SUCCESS_KEY, success);
        messages.put(ResponseMessageStatusCode.WRAPPER_FAILURE_KEY, failure);
    }

    /**
     * 根据Dto是否为空判断方法是否执行成功
     *
     * @param toBeWrapped 被包装的response
     * @param dto         数据传输参数
     * @return 包装好的response
     */
    public CommonResponse<T> responseJudgeByNotNullDto(CommonResponse<T> toBeWrapped, T dto) {
        if (dto != null) {
            // 返回的dto不为空，则证明业务的执行是成功的
            toBeWrapped.setSuccess(true);
            toBeWrapped.setMessage(messages.get(ResponseMessageStatusCode.WRAPPER_SUCCESS_KEY));
            toBeWrapped.setDtoResponse(dto);
        } else {
            // 返回的dto为空，则证明业务执行失败了
            toBeWrapped.setSuccess(false);
            toBeWrapped.setMessage(messages.get(ResponseMessageStatusCode.WRAPPER_FAILURE_KEY));
            toBeWrapped.setDtoResponse(null);
        }
        return toBeWrapped;
    }

    /**
     * 根据特殊条件判断方法是否执行成功
     *
     * @param toBeWrapped 被包装的response
     * @param dto         数据传输参数
     * @param condition   执行成功判断条件
     * @return 包装好的response
     */
    public CommonResponse<T> responseJudgeByCondition(CommonResponse<T> toBeWrapped, T dto, Boolean condition) {
        if (condition.equals(Boolean.TRUE)) {
            // 如果满足条件，表示业务执行成功
            toBeWrapped.setSuccess(true);
            toBeWrapped.setMessage(messages.get(ResponseMessageStatusCode.WRAPPER_SUCCESS_KEY));
        } else {
            // 如果不满足条件，表示业务执行失败了
            toBeWrapped.setSuccess(false);
            toBeWrapped.setMessage(messages.get(ResponseMessageStatusCode.WRAPPER_FAILURE_KEY));
        }
        toBeWrapped.setDtoResponse(dto);
        return toBeWrapped;
    }
}
