class prime{
	public static void main(String[] args){
		int num = 6;
		int coun = 0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				coun=1;
				break;
			}
		}
		if(coun==1){
			System.out.print("Its not a Prime number");
		} else{
			System.out.print("Its a prime number");
		}
	}
}