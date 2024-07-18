class electricity{
	public int number = 123;
	public String name = "saipavan";
	public double prev_month = 150;
	public double curr_month = 200;
	
	public double calc(){
		double amount;
		if(curr_month==100){
			amount = curr_month*1;
		}
		else if(curr_month>100 && curr_month<200){
			amount = curr_month*2.50;
		}
		else if(curr_month>200 && curr_month<500){
			amount = curr_month*4;
		}
		else{
			amount = curr_month*6;
		}
		return amount;
	}
	
	public static void main(String[] args){
		electricity obj = new electricity();
		System.out.print("Electricity Bill = "+obj.calc());
	}
}
		
	