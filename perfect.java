class perfect{
	public static void main(String[] args){
		int num = 6;
		int sum = 0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				sum+=i;
			}
		}
		if(sum==num){
			System.out.print("Its a perfect number");
		}
	}
}