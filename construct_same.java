class construct_same{
	public static void main(String[] args){
		String str1 = "aa", str2 = "ab";
		int j=0,coun = 0;
		for(int i=0;i<str2.length();i++){
			if(str2.charAt(i) == str1.charAt(j)){
				coun++;
				j++;
			}
		}
		if(coun == str1.length()){
			System.out.print("True");
		} else{
			System.out.print("False");
		}
	}
}
