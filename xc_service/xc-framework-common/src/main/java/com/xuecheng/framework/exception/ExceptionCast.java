package com.xuecheng.framework.exception;

import com.xuecheng.framework.model.response.ResultCode;

/**
 *  简化异常抛出代码
 *  使用时不用再new CustomException
 *  直接调用cast方法即可,看起来更整洁
 */
public class ExceptionCast {

    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
