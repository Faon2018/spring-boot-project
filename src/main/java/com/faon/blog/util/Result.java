package com.faon.blog.util;

import com.alibaba.fastjson.JSON;

public class Result {
    public static final int SUCCESS=200;
    public static final int ERROR=200;
    private int code;
    private String message;
    private Object data;


    public static String SuccessResult(Object data){
        Result result = new Result();
        result.code = SUCCESS;
        result.message = "成功！";
        result.data = data;
        return  JSON.toJSONString(result);
    }

    public static String ErroResult(Object data){
        Result result = new Result();
        result.code = ERROR;
        result.message = "请求失败！";
        result.data = data;
        return  JSON.toJSONString(result);
    }
}
