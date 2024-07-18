class tax{
	public static void main(String[] args){
		double income = 600000;
		if(income<=250000){
			System.out.print("No TAX!!!");
		} else if(income>250001 && income<500000){
			income = income - (income*0.10);
		} else if(income>500001 && income<1000001){
			income = income - (income*0.30);
		}
		System.out.print(income);
	}

}
