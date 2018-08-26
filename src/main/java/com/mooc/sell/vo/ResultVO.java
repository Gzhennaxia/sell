package com.mooc.sell.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description： http请求返回的最外层对象
 * @Auther： Administrator
 * @date： 2018/8/1:21:05
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = 3145907678144848063L;
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
