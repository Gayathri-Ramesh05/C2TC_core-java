package day8.interfaces.implementinginterfaces;

public class Account {
	private int accNo;
	 private String name;
	 private double balance;
	 private BankImpl bank;

	 public Account(int accNo, String name, double balance, BankImpl bank2) {
	     this.accNo = accNo;
	     this.name = name;
	     this.balance = balance;
	     this.bank = bank2;
	 }

	 public int getAccNo() {
	     return accNo;
	 }

	 public String getName() {
	     return name;
}

	 public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	 }

	 public void setBalance(double d) {
		// TODO Auto-generated method stub
		
	 }

	 public double getBalance1() {
		// TODO Auto-generated method stub
		return 0;
	 }

	 public void deposit(int i) {
		// TODO Auto-generated method stub
		
	 }

	 public void withdraw(int i) {
		// TODO Auto-generated method stub
		
	 }
}
