class student{
	int sub1, sub2, sub3, sub4, sub5, sub6;
	
	student(int s1, int s2, int s3, int s4, int s5, int s6){
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
		sub5 = s5;
		sub6 = s6;
	}
}

class calc extends student{
	
	calc(int s1, int s2, int s3, int s4, int s5, int s6){
		super(s1, s2, s3, s4, s5, s6);
	}
	
	public void calculate(){
		int avg = (sub1+sub2+sub3+sub4+sub5+sub6)/6;
		if(avg>75){
			System.out.print("Distinction");
		} else if(avg>60 && avg<75){
			System.out.print("First Division");
		} else if(avg>50 && avg<60){
			System.out.print("Second Division");
		} else if(avg>40 && avg<50){
			System.out.print("Third Division");
		} else{
			System.out.print("FAIL");
		}
	}
	
	public static void main(String[] args){
		calc obj = new calc(90,90,90,90,90,90);
		obj.calculate();
	}
}
	
		