import java.util.Scanner;

class customer{
	public int acc_no = 12345;
	public String acc_name = "Saipavan";
	public double balance = 10000;
	public Scanner sc = new Scanner(System.in);
	
	
	public void withdraw(double amount){
		if(balance-amount<0){
			System.out.println("Wait!!!, Let the amount deposit");
			boolean wai = wait(Math.abs(balance-amount), amount);
			if(wai==true){
				System.out.println("Amount Deposited successfully, withdraw completed!!");
				System.out.println("Total Balance = "+balance);
			}
			else{
				System.out.println("Amount deposited not sufficient to withdraw!!!");
			}
		}
		else{
			balance-=amount;
			System.out.println("Total Balance = "+amount);
		}
	}
			
		
	public boolean wait(double bal, double amount){
		boolean ans = deposit(bal, amount);
		if(ans==true){
			return true;
		} else{
			return false;
		}
	}
	
	
	public boolean deposit(double amoun, double amount){
		System.out.println("Please Deposit "+amoun+" to withdraw the amount");
		double am;
		System.out.println("Enter amount to deposit : ");
		am = sc.nextDouble();
		balance = (balance+am)-amount;
		return true;
	}
	
	public static void main(String[] args){
		customer obj = new customer();
		obj.withdraw(12000);
	}
}