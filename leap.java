class leap{
	public static void main(String arg[]){
		int year = 2024;
		if(year%400==0 && year%100==0){
			System.out.print("Its a leap year");
		}
		else if(year%4==0 && year%10!=0){
			System.out.print("Its a leap year");
		}
		else{
			System.out.print("Its not a leap year");
		}
	}
}