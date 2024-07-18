class pal{
	public static void main(String[] args){
		String text = "madam";
		int len = text.length();
		int coun = 0, j=0;
		for(int i=len-1;i>=0;i--){
			if(text.charAt(i)==text.charAt(j)){
				coun++;
				j++;
			}
		}
		if(coun==text.length()){
			System.out.print("It'a a palindrome");
		} else{
			System.out.print("It's not a palindrome");
		}
	}
}
