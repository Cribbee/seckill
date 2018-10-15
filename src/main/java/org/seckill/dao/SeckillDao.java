package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * ClassName: SeckillDao
 * Description: TODO
 * Author: Cribbee
 * Date: 2018/10/14、下午4:53
 * Version: 1.0
 **/
public interface SeckillDao {
    /**
     * desc:减库存
     * @auther: Cribbee
     * @date: 2018/10/14 下午5:20
     * @param: seckillId
     * @param: KillTime
     * @return: 如果影响的行数>1，表示更新的记录行数
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime")  Date killTime);

    /**
     * desc: 根据id查询秒杀对象
     * @auther: Cribbee
     * @date: 2018/10/14 下午5:26
     * @param:
     * @return:
     */
    Seckill queryById(long seckillId);

    /**
     * desc:根据便宜了查询秒杀商品列表
     * @auther: Cribbee
     * @date: 2018/10/14 下午5:22
     * @param: offet
     * @param: limit
     * @return:
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);




}
