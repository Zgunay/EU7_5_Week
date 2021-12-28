package day17_classObjekt;

public  class BankAccount {

	
	 double balance;
	String accountHolder;
	int accountnumber;
	
	public void deposit( double amount) {
		System.out.println("depositing $" + amount + "to" + accountnumber);
		balance+=amount;
	}
	
	public  void withdraw( double amount) {
		System.out.println("Withdraw $" + amount + "from" + accountnumber);
		balance-=amount;
		
		if(balance<0) {
			balance-=35;
			
		}
		
	}
	
	public void showBalance () {
		System.out.println("--------------------");
		System.out.println("accountnumber:"  + accountnumber);
		System.out.println("accountHolder:"  + accountHolder);
		System.out.println("balance: $"  + balance);
		System.out.println("--------------------");

	}
	
	public void charge(double price,String item) {
		
		if(balance>=price) {
			System.out.println("buying" + item +"for $" +price + " from" +accountnumber);
			balance-=price;
		}else {
			System.out.println("insufficent funds to purchase" + item + " from " + accountnumber);
		}
	}
}
