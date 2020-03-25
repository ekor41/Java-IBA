package com.mybank.domain;

public class Account {
   private double balance;
    public Account (double initBalance)
    {
        balance =initBalance;
    }
    public void deposit (double amt){
        balance=balance+amt;
    }
    public void withrdaw (double amt){
        if (balance >= amt){
            balance = balance - amt;
            }
        }
       public double getBalance() {
        return balance;
       }
    }

