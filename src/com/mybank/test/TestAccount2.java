package com.mybank.test;

import com.mybank.domain.Account;

public class TestAccount2{
    public static void main (String[] args){
        Account acct= new Account(100);
        acct.deposit(47);
        acct.withrdaw(150);
        System.out.println("dobavil");
        System.out.println("poluchilos "+acct.getBalance());
    }
}