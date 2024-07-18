class matrix_add{
	public static void main(String args[]){
		int a[][] = {{1,2},{3,4}};
		int b[][] = {{5,6},{7,8}};
		int c[][] = {{0,0},{0,0}};
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/*
Applications:
1) Structural Analysis
2) Image Filtering
3) Linear Regression
4) Finance
5) Network Analysis
*/