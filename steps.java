class steps{
	public static void main(String[] args){
		int num = 14;
		int step = 0;
		while(num!=0){
			if(num%2==0){
				num = num/2;
				step++;
			} else{
				num-=1;
				step++;
			}
		}
		System.out.print("Steps = "+step);
	}
}