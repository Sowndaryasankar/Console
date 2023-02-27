package zsgs.bankingapplication.Banking;

import java.util.ArrayList;
import java.util.Date;

import zsgs.bankingapplication.dao.BankTransaction;

public class BankingController {
	private BankingView bankingview;
	private BankingModel bankingmodel;

	public BankingController(BankingView bankingView) {
		this.bankingview = bankingView;
		this.bankingmodel = new BankingModel(this);

	}

	public void checkTrasactionHistory(int accountNo) {
		bankingmodel.checkTrasactionHistory(accountNo);
		
	}

	public void checkBalance(int accountNo) {
		bankingmodel.checkBalance(accountNo);
		
	}

	public void checkDeposit(int accountNo, int amount, Date date) {
		bankingmodel.checkDeposit(accountNo, amount, date);
		
	}

	public void checkWithDrawFund(int accountNo, int amount, Date date) {
		bankingmodel.checkWithDrawFund(accountNo,amount,date);
	}

	public void returnTrasactionHistory(ArrayList<BankTransaction> viewTransection) {
		bankingview.transectionHistory(viewTransection);
		
		
	}

	public void returncheckBalance(String error) {
		bankingview.viewAcBalance(error);
		
	}

	public void returncheckBalance(long balance) {
		bankingview.viewAcBalance(balance);
		
	}

	public void returncheckDeposit(long balance, int amount) {
		bankingview.depositBalance(balance, amount);
		
	}

	public void returncheckWithDrawFund(String error) {
		bankingview.withdrawBalance(error);
		
	}

	public void returncheckWithDrawFund(long balance, int amount) {
		bankingview.withdrawBalance(balance, amount);
		
	}

	


		
		
	}

	