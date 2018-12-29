package com.ryl.crud.controller;

import com.ryl.crud.service.ITransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class TransactionController {

    @Autowired
    ITransactionService iTransactionService;


    @RequestMapping("/business")
    @ResponseBody
    public String business(){
        if(iTransactionService.business()){
            return "操作成功";
        }
        return "操作失败";
    }
}
