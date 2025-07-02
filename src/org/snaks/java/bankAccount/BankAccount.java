package org.snaks.java.bankAccount;

import java.math.BigDecimal;

public class BankAccount {

  private int accountCode;
  private BigDecimal balance;

  public BankAccount(int accountCode) {
    this.accountCode = accountCode;
    this.balance = new BigDecimal(0);
  }

  public BigDecimal getBalance() {
    return this.balance;
  }

  public void addBalance(BigDecimal amount) {
    this.balance.add(amount);
  }

  public void retriveBalance(BigDecimal amount) {
    this.balance.subtract(amount);
  }
}
