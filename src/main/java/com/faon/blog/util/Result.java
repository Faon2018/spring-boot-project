package com.faon.blog.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;


public class Result {
    public static final int SUCCESS=200;
    public static final int ERROR=201;
    private int code;
    private String message;
    private Object data;


    public Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {
    }

    public static String SuccessResult(Object data){
        Result result = new Result(Result.SUCCESS,"成功",data);
        return  JSON.toJSONString(result, SerializerFeature.WriteMapNullValue);
    }

    public  String ErroResult(Object data){
        Result result = new Result();
        result.code = ERROR;
        result.message = "请求失败！";
        result.data = data;
        return  JSON.toJSONString(result);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
