package com.ojay.common.exception;


import com.ojay.common.model.enums.AppHttpCodeEnum;
import lombok.Getter;

/**
 * @author ojay
 */
@Getter
public class BusinessException extends RuntimeException{
    private final int code;

    private final String msg;

    public BusinessException(AppHttpCodeEnum httpCodeEnum) {
        super(httpCodeEnum.getMsg());
        this.code = httpCodeEnum.getCode();
        this.msg = httpCodeEnum.getMsg();
    }

    public BusinessException(AppHttpCodeEnum httpCodeEnum, String msg) {
        super(httpCodeEnum.getMsg());
        this.code = httpCodeEnum.getCode();
        this.msg = httpCodeEnum.getMsg() + "：" + msg;
    }
}