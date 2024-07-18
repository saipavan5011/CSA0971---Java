class armstrong{
	public static void main(String[] args){
		int num =153;
		int sum = 0;
		int dup = num;
		while(dup!=0){
			int digit = dup%10;
			sum+=Math.pow(digit,3);
			dup/=10;
		}
		if(num==sum){
			System.out.print("Its a Armstrong number");
		}
	}
}