package com.kodewala.interfaces.usecasetwo;

public class Driver {

	public static void main(String[] args) {
		SavingAccount savingAccount=new SavingAccount(10000);
		CurrentAccount currentAccount=new CurrentAccount(5000);
		savingAccount.checkBalance();
		currentAccount.checkBalance();

	}

}
