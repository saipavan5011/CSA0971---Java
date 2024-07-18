class square_arr{
	public static void main(String[] args){
		int lower = 45,upper = 49;
		int len = upper - lower+1;
		int[][] arr = new int[len][2];
		for(int i=0;i<len;i++){
			int num = lower+i;
			arr[i][0] = num;
			arr[i][1] = num*num;
		}
		for(int i=0;i<len;i++){
			System.out.print(arr[i][0]);
			System.out.print(" "+ arr[i][1]);
			System.out.println();
		}
	}
}