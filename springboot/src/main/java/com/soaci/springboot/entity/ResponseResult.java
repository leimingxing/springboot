package com.soaci.springboot.entity;

public class ResponseResult<T> {

    private String message;
    private Integer code;
    private T date;

    public ResponseResult() {
    }

    public ResponseResult(String message, Integer code, T date) {
        this.message = message;
        this.code = code;
        this.date = date;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "message='" + message + '\'' +
                ", code=" + code +
                ", date=" + date +
                '}';
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }


}
