package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount extends BankAccount {

	private static BigDecimal interestRate = new BigDecimal("0.02");

	public SavingsAccount() {
		super();

	}

	public SavingsAccount(String acctNumber, BigDecimal balance) {

		super(acctNumber, balance);

	}

	@Override
	public BigDecimal withdraw(BigDecimal amountToWithdraw) {

		if (super.getBalance().doubleValue() > 150) {

			super.withdraw(amountToWithdraw);

		} else {
			if (((super.getBalance().doubleValue() < 150) && (super.getBalance().doubleValue() >= 0))	&&
					amountToWithdraw.doubleValue() <= super.getBalance().doubleValue()) {
				super.withdraw(amountToWithdraw.add(new BigDecimal("2.00")));
			} else {

				return super.getBalance();
			}

		}
		return super.getBalance();
	}

	/**
	 * @return the interestRate
	 */
	public static BigDecimal getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	private static void setInterestRate(BigDecimal interestRate) {
		SavingsAccount.interestRate = interestRate;
	}

	@Override
	public BigDecimal addInterest() {
	
		return super.deposit(super.getBalance().setScale(0, RoundingMode.HALF_UP).multiply(interestRate));
		
	}

}
