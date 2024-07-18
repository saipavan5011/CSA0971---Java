class largest{
	public static void main(String[] args){
		int arr[] = {14, 67, 48, 23, 5, 62};
		int n=4;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(arr[n-1]);
	}
}