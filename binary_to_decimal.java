class binary_to_decimal{
	public static void main(String[] args){
		String binary = "1101";
		int decimal = Integer.parseInt(binary, 2);
		System.out.print(decimal);
	}
}