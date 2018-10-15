package org.seckill.exception;

/**
 * ClassName: SeckillException
 * Description: 秒杀相关业务异常
 * Author: Cribbee
 * Date: 2018/10/15、下午9:14
 * Version: 1.0
 **/
public class SeckillException extends RuntimeException{

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
