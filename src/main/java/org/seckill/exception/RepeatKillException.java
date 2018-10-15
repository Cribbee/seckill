package org.seckill.exception;

/**
 * ClassName: RepeatKillException
 * Description: 重复秒杀异常（运行期异常）
 * Author: Cribbee
 * Date: 2018/10/15、下午8:50
 * Version: 1.0
 **/
public class RepeatKillException extends SeckillException{

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
