package org.seckill.dto;

/**
 * ClassName: SeckillResult
 * Description: 所有ajax请求返回类型，用来封装json结果
 * Author: Cribbee
 * Date: 2018/10/18、下午3:40
 * Version: 1.0
 **/
public class SeckillResult<T> {

    private boolean success;

    private T data;

    private  String error;

    public SeckillResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public SeckillResult(boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
