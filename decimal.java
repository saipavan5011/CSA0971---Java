class decimal{
	public static void main(String[] args){
		int decimal = 12;
		String binary = Integer.toBinaryString(decimal);
		String octal = Integer.toOctalString(decimal);
		System.out.println(binary);
		System.out.print(octal);
	}
}