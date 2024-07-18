class composite{
	public static void main(String[] args){
		int arr[] = {16, 18, 27, 16, 23, 21, 19};
		int coun = 0;
		int pri = 0;
		for(int i=0;i<arr.length;i++){
			pri = 0;
			for(int j=2;j<arr[i];j++){
				if(arr[i]%j==0){
					pri = 1;
					break;
				}
			}
			if(pri==1){
				coun++;
			}
		}
		System.out.print("No of composite numbers = "+coun);
	}
}
