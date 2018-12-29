package com.ryl.crud.service.impl;

import com.ryl.crud.dao.mapper.BankMapper;
import com.ryl.crud.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransactionService implements ITransactionService {

    @Autowired
    BankMapper bankMapper;

    @Override
    public boolean business() {
        int res1 = bankMapper.updateAccount(1, BigDecimal.valueOf(-100));
        //int i = 1/0;
        int res2 = bankMapper.updateAccount(2, BigDecimal.valueOf(100));
        if(res1>0 &&res2>0){
            return true;
        }
        return false;
    }
}
