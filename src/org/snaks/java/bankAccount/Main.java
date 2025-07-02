package org.snaks.java.bankAccount;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(0001);

    System.out.println(bankAccount.getBalance());
    bankAccount.addBalance(new BigDecimal(2000));
    System.out.println(bankAccount.getBalance());
    bankAccount.retriveBalance(new BigDecimal(500));
    System.out.println(bankAccount.getBalance());
    bankAccount.retriveBalance(new BigDecimal(3000));
  }
}
