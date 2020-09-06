package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
* @Description:    自定义异常信息
* @Author:         zzq
* @CreateDate:     2020/9/6
*/
public class CustomException extends RuntimeException {


    ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        //异常信息为错误代码+异常信息
        super("错误代码: " + resultCode.code() + " 错误信息: " + resultCode.message());
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

}
