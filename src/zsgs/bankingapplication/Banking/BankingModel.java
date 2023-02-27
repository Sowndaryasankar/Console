package zsgs.bankingapplication.Banking;

import java.util.ArrayList;
import java.util.Date;

import zsgs.bankingapplication.repository.*;
import java.util.Random;

public class BankingModel {
	private BankingController bankingcontroller;
	BankingRepository br = BankingRepository.getInstance();

	public BankingModel(BankingController bankingController) {
		this.bankingcontroller = bankingController;
	}
	public void checkTrasactionHistory(int accountNo) {

		bankingcontroller.returnTrasactionHistory(br.viewTransection(accountNo));

	}

	public void checkBalance(int accountNo) {
		long balance = br.checkBalance(accountNo);
		if (balance == -1) {
			bankingcontroller.returncheckBalance("Wrong Account Number!!");

		} else {
			bankingcontroller.returncheckBalance(balance);

		}
	}


	public void checkDeposit(int accountNo, int amount, Date date) {
		long balance=br.checkDeposit(accountNo, amount, date);
		System.out.println(balance);
		{
			bankingcontroller.returncheckDeposit(balance, amount);
		}

	}

	public void checkWithDrawFund(int accountNo, int amount, Date date) {
		long balance=br.checkWithdraw(accountNo, amount, date);
		if(balance==0)
		{
			bankingcontroller.returncheckWithDrawFund("Insufficient Balance");
		}
		else {
			bankingcontroller.returncheckWithDrawFund(balance, amount);
		}
	}
		
	}
