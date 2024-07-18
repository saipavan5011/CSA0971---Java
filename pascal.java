class pascal{
	public static void main(String[] args){
		int n = 5;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			int num = 1;
			for(int k=0;k<=i;k++){
				System.out.print(num+" ");
				num = num*(i-k)/(k+1);
			}
			System.out.println();
		}
	}
}

/*
Applications:
1) Bionomial Coefficient
2) Algebra
3) Fibonocci Sequence
4) Error Correction
5) Signal Processing
*/