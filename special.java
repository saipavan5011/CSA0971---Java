class special{
	public static void main(String[] args){
		String name = "sai@pa#van";
		int coun = 0;
		for(int i=0;i<name.length();i++){
			if(name.charAt(i)=='#' || name.charAt(i)=='@'){
				coun++;
			}
		}
		System.out.print(coun);
	}
}

/*
1) Text processing
2) Syntax Checking
3) Encoding
4) NLP
5) DBM