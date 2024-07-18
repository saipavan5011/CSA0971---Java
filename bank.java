import java.util.Scanner;

class bank{
	public String name;
	public int acc_no;
	public String type;
	public double balance = 10000;
	
	public void get_details(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		name = sc.nextLine();
		System.out.print("Enter your Account Number : ");
		acc_no = sc.nextInt();
		System.out.print("Enter the account type : ");
		type = sc.next();
	}
	
	public void deposit(){
		Scanner sc = new Scanner(System.in);
		double amount;
		System.out.print("Enter the amount to be deposited : ");
		amount = sc.nextDouble();
		balance+=amount;
	}
	
	public void withdraw(){
		Scanner sc = new Scanner(System.in);
		double with;
		System.out.print("Enter the amount to withdraw : ");
		with = sc.nextDouble();
		
						
		if(balance-with<500){
			System.out.print("Minimum Balance to be maintained is 500!!!");
		} else{
			balance = balance - with;
		}
	}
	
	public static void main(String[] args){
		bank obj = new bank();
		obj.get_details();
		obj.deposit();
		obj.withdraw();
		System.out.println("Total Balance in the account = "+obj.balance);
		//sc.close()
	}
}