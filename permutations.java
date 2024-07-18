class permutations{
	public static void main(String[] args){
		int num = 123, i=0;
		int[] arr = new int[3];
		while(num!=0){
			int digit = num%10;
			arr[i] = digit;
			i++;
			num/=10;
		}
		int len = arr.length;
		for(int k=0;k<len;k++){
			for(int l=0;l<len;l++){
				if(l!=k){
				for(int s=0;s<len;s++){
					if(s!=k && s!=l){
					System.out.print(arr[k]);
					System.out.print(arr[l]);
					System.out.print(arr[s]);
					System.out.println();
				}
			}
		}
	}
}
	}
}
