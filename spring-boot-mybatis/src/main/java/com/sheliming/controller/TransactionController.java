package com.sheliming.controller;

import com.sheliming.domain.User;
import com.sheliming.service.TransactionService;
import com.sheliming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping("/insertUserNoTransaction")
    public void insertUserNoTransaction(){
         transactionService.insertUserNoTransaction();
    }

    @RequestMapping("/insertUserWithTransaction")
    public void insertUserWithTransaction(){
         transactionService.insertUserWithTransaction();
    }
}
