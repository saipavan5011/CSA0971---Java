class same_element{
	public static void main(String[] args){
		int arr1[] = {1,2,3,4};
		int arr2[] = {2, 4,5,6,7,8};
		int[] same = new int[5];
		int j=0;
		for(int i=0;i<arr1.length;i++){
			for(int k=0;k<arr2.length;k++){
				if(arr1[i]==arr2[k]){
					same[j] = arr1[i];
					j++;
				}
			}
		}
		for (int i=0;i<j;i++){
			System.out.print(same[i]+" ");
		}
	}
}