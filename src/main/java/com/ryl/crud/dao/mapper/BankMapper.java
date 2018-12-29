package com.ryl.crud.dao.mapper;

import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

public interface BankMapper {

    @Update("UPDATE bank SET account = account+#{param2} WHERE id = #{param1}")
    int updateAccount(int id,BigDecimal num);
}
