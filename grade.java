class marks{
	int python = 90;
	int  c = 91;
	int math = 92;
	int phy = 93;
	int chem = 92;
	int prof = 93;
	double avg;
	double total;
}

class grade extends marks{
	public void calc(){
		total = (python+c+math+phy+chem+prof);
		avg = (total)/5;
	}
	
	public static void main(String[] args){
		grade obj = new grade();
		obj.calc();
		if(obj.avg>90){
			System.out.print("Distinction");
		}
		else if(obj.avg>80 && obj.avg<=90){
			System.out.print("A Grade");
		}
		else if(obj.avg>70 && obj.avg<=80){
			System.out.print("B grade");
		}
	}
	}
	