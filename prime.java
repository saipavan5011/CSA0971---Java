class prime{
	public static void main(String[] args){
		int coun = 0, n=3, c=0, pri=0, co=0;
		for(int i=2;i<100;i++){
			coun = 0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					coun=1;
					break;
				}
			}
			if(coun==0){
				c+=1;
			}
			if(c==n){
				pri = i;
				break;
			}
			
		}
		for(int i=pri+1;i<100;i++){
			coun=0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					coun = 1;
					break;
				}
			}
			if(coun==0){
				co++;
				System.out.print(i+" ");
			}
			if(co==n){
				break;
			}
		}
}
}