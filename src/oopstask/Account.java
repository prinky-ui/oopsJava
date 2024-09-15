package oopstask;

public class Account {
	double balance;
	String accountnumber;
	
	Account(){
		this.balance = 0.0;
		this.accountnumber = "unknow";
		
	}
	
	Account(double initialBalance,String accountnumber){
		this.balance = initialBalance;
		this.accountnumber = accountnumber;	
	}
	void deposit(double amount) {
		if(amount>0) {
			this.balance +=amount;
			System.out.println("Deposited: $" +amount);
		}else{
			System.out.println("Deposit amount must be positive. ");
			
		}
	}
	void withdraw(double amount) {
		if(amount>0) {
		if(amount<=this.balance) {
			this.balance -= amount;
			System.out.println("Withdrew: $ " +amount);
		}else {
			System.out.println("Insufficient balance for withdrawal.");
		}
		}
		
			
		}
	public double getBalance() {
		return this.balance;
		}
	 	void displayAccountInfo() {
	 	System.out.println("Account Number: " +this.accountnumber);
	 	System.out.println("Current Balance: $ "+this.balance);
	 	}  
	
		
		
	public static void main(String[] args) {
		Account acc1 = new Account();// with no argument
		acc1.displayAccountInfo();// 
		
		Account acc2 = new Account(5000.0,"457812");//
		acc2.displayAccountInfo();
		
		acc2.deposit(500.0);
		acc2.withdraw(4000.0);
		acc2.displayAccountInfo();
	}
	

}
