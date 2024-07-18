class merge{
	public static void main(String[] args){
		int arr1[] = {1,3,4,5};
		int arr2[] = {2,4,6,8};
		int len = arr1.length+arr2.length;
		int[] arr3 = new int[len];
		int k=0;
		for(int i=0;i<arr1.length;i++){
			arr3[k] = arr1[i];
			k++;
		}
		for(int i=0;i<arr2.length;i++){
			arr3[k] = arr2[i];
			k++;
		}
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(arr3[j]<arr3[i]){
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			// }
		}
		for(int i=0;i<len;i++){
			System.out.print(arr3[i]+" ");
		}
	}
}