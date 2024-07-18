class days{
	public static void main(String[] args){
		int days = 756;
		int total_days = 365;
		int year = days/total_days;
		int rem = days%total_days;
		int weeks = rem/7;
		int day = rem%7;
		System.out.print(year+" "+weeks+" "+day);
	}
}