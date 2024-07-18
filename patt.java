class patt{
	public static void main(String[] args){
		int i=0,n=5;
		while(i<=n){
			for(int space = 1;space<=n-i;space++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
			i++;
		}  
	}
}
