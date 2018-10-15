package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.seckill.entity.Seckill;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled(){
        long id = 1000L;
        long userPhone = 13124584638L;
        int insertCount = successKilledDao.insertSuccessKilled(id, userPhone);
        System.out.println("affect lines:" + insertCount);
    }

    @Test
    public void queryByIdWithSeckill() {
        long id = 1001L;
        long userPhone = 13124584638L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, userPhone);
        System.out.println(successKilled);
        if(successKilled != null){
                System.out.println(successKilled.getSeckill());
        }


    }
}