class statistics{
	public static void main(String[] args){
		int arr[] = {16,18,27,16,23,21,19};
		int sum=0;
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
			sum+=arr[i];
		}
		double mean = sum/arr.length;
		double med = (arr[arr.length/2]+arr[(arr.length/2)+1])/2;
		int mode = arr[0];
		int prev_max = 0;
		int max=0;
		for(int i=0;i<arr.length;i++){
			max=0;
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j]){
					max++;
				}
			}
			if(max>prev_max){
				mode = arr[i];
			}
			prev_max = max;
		}
		System.out.println("Mean = "+mean);
		System.out.println("Median = "+med);
		System.out.println("Mode = "+mode);
	}
}