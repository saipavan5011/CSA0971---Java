class max_min{
	public static void main(String[] args){
		int arr[] = {14, 16, 87, 36, 25, 89, 34};
		int m=1, n=3;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int max = arr[arr.length-m];
		int min = arr[n-1];
		System.out.println("Maximum : "+max);
		System.out.println("Minimum : "+min);
		System.out.println("Addition = "+(max+min));
		System.out.println("Subtraction = "+(max-min));
	}
}