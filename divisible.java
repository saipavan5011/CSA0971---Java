class divisible{
	public static void main(String[] args){
		int[] num_arr = new int[5];
		for(int i=0;i<5;i++){
			num_arr[i] = i;
		}
		int j=0;
		String[] str_arr = new String[5];
		for(int i=0;i<5;i++){
			if(i%3==0 && i%5==0){
				str_arr[j] = "FizzBuzz";
				j++;
			}
			else if(i%3==0){
				str_arr[j] = "Fizz";
				j++;
			}
			else if(i%5==0){
				str_arr[j] = "Buzz";
				j++;
			}
		}
		for(int i=0;i<j;i++){
			System.out.print(str_arr[i]+" ");
		}
	}

}