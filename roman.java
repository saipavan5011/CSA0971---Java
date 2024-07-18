class roman{
	public static void main(String[] args){
		char symbol[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int value[] = {1, 5, 10, 50, 100, 500, 1000};
		int sum = 0;
		String input = "III";
		for(int i=0;i<input.length();i++){
			for(int j=0;j<symbol.length;j++){
				if(input.charAt(i)==symbol[j]){
					sum+=value[j];
				}
			}
		}
		System.out.print("Total = "+sum);
	}
}