class date{
	int day;
	int month;
	int year;
	public int get_detail(){
		System.out.print(day+"/"+month+"/"+year);
		return 0;
	}
}

class Student extends date{
	int id;
	String name;
	int m1,m2,m3;
	
	Student(int i, String na, int dat, int mo, int ye, int m11, int m22, int m33){
		id = i;
		name = na;
		m1=m11;
		m2=m22;
		m3=m33;
		day=dat;
		month = mo;
		year = ye;
		
	}
	
	public void print(){
		System.out.println("Name = "+name);
		System.out.println("Id = "+id);
		System.out.print("DOB = ");
		get_detail();
		System.out.println();
		System.out.println("Mark1 = "+m1);
		System.out.println("Mark2 = "+m2);
		System.out.println("Mark3 = "+m3);
	}
	
	public static void main(String[] args){
		Student obj = new Student(1234, "sai", 5, 12, 2004, 90, 95, 100);
		obj.print();
	}
}