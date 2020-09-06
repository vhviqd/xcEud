package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
* @Description:    抛出异常类
* @Author:         zzq
* @CreateDate:     2020/9/6
*/
public class ExceptionCast {

    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
