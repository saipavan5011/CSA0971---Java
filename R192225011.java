class R192225011{
	
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

/*
Applications :
1) Cryptography
2) Data Compression
3) Error Detection
4) Traffic Light Synchronization
5) Network Optimization
*/