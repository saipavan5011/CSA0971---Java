class sum_of_digits{
	public static void main(String[] args){
		int num =  123;
		int sum = 0;
		while(num!=0){
			int digit = num%10;
			sum+=digit;
			num/=10;
		}
		System.out.print(sum);
	}
}
