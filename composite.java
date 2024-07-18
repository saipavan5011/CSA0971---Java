class composite{
	public static void main(String[] args){
		int a = 12, b = 19;
		int coun = 0;
		for(int i=a; i<=19;i++){
			for(int j=2;j<i;j++){
				if(i%j==0){
					coun=1;
					break;
				}
				else{
					coun = 0;
				}
		}
		if(coun==0){
			System.out.print(i+" ");
		}
	}
}
}