package org.snaks.java.bankAccount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {

  private int accountCode;
  private BigDecimal balance;

  public BankAccount(int accountCode) {
    this.accountCode = accountCode;
    this.balance = new BigDecimal(0);
  }

  public BigDecimal getBalance() {
    return this.balance.setScale(2, RoundingMode.DOWN);
  }

  public void addBalance(BigDecimal amount) {
    this.balance = this.balance.add(amount);
  }

  public void retriveBalance(BigDecimal amount) {
    if (amount.compareTo(this.balance) > 0)
      throw new IllegalArgumentException(
          String.format("Saldo insufficiente per prelevare € %s", amount.setScale(2, RoundingMode.DOWN)));

    this.balance = this.balance.subtract(amount);
  }
}
