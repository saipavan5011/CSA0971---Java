class factor{
	public static void main(String[] args){
		int nth = 0, coun = 0;
		for(int i=1;i<=100;i++){
			if(100%i==0){
				coun++;
				if(coun==4){
					nth = i;
			}
			}
		}
		System.out.print(coun+" "+nth);
	}
}