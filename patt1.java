class patt1{
	public static void main(String[] args){
		for(int i=0;i<=5;i++){
			for(int space = 5;space>=i;space--){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
		