package day8.interfaces.implementinginterfaces;

public class Account {
	private int accNo;
	 private String name;
	 private double balance;
	 private Bank bank;

	 public Account(int accNo, String name, double balance, Bank bank) {
	     this.accNo = accNo;
	     this.name = name;
	     this.balance = balance;
	     this.bank = bank;
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
}
