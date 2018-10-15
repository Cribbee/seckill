package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * ClassName: SuccessKilledDao
 * Description: TODO
 * Author: Cribbee
 * Date: 2018/10/14、下午5:30
 * Version: 1.0
 **/
public interface SuccessKilledDao {

    /**
     * desc: 插入购买明细，可过滤重复
     * @auther: Cribbee
     * @date: 2018/10/14 下午5:31
     * @param: seckillId
     * @param: userPthone
     * @return:
     */
    int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

    /**
     * desc: 根据id查询SuccessKilled并携带秒杀产品对象实体
     * @auther: Cribbee
     * @date: 2018/10/14 下午5:34
     * @param: seckillId
     * @return:
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
}
