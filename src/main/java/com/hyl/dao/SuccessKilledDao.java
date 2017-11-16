package com.hyl.dao;

import com.hyl.entity.SuccessKilled;
import org.apache.ibatis.annotations.Param;

public interface SuccessKilledDao {

    int insertSuccessKilled(@Param("seckillId") long seckillId,@Param(("userPhone")) long userPhone);

    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone") long userPhone);
}
