package com.mooc.sell.exception;

import com.mooc.sell.enums.ResultEnum; /**
 * @Description:
 * @Author: LiBo
 * @Date: 2018/8/5下午 05:15
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
