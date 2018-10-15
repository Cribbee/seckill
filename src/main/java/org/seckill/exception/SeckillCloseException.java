package org.seckill.exception;

/**
 * ClassName: SeckillCloseException
 * Description: 秒杀关闭异常
 * Author: Cribbee
 * Date: 2018/10/15、下午9:13
 * Version: 1.0
 **/
public class SeckillCloseException extends SeckillException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
