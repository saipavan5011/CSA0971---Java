class gcd{
	
	static int func(int a, int b){
		if(b==0){
			return a;
		}
		return func(b, a%b);
		
	}
	
	public static void main(String[] args){
		int a=10, b=5;
		int gcd = func(a,b);
		int lcm = (a*b)/gcd;
		System.out.print(lcm+" "+gcd);
	}
}
