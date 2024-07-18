class length_last{
	public static void main(String[] args){
		String s = "Hello World";
		s = s.trim();
		String[] arr = s.split(" ");
		System.out.print(arr[1].length());
	}
}