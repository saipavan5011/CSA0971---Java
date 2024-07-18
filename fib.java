class fib{
	public static void main(String arg[]){
		int a=0,b=1;
		System.out.print(a+" "+b+" ");
		int limit = 5;
		while(limit!=0){
			int c = a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			limit--;
		}
	}
}