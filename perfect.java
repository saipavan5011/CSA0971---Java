class perfect{
	public static void main(String[] args){
		int lower = 1;
		int upper = 40;
		int sum = 0;
		for(int i=lower;i<upper;i++){
			if(Math.sqrt(i)%1==0){
				int dup = i;
				sum = 0;
				while(dup!=0){
					int digit = dup%10;
					sum+=digit;
					dup/=10;
				}
				if(sum<=10){
					System.out.print(i+" ");
				}
			}
	}
}

}