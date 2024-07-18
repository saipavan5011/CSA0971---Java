class Sai{
	int age = 19;
	public String func1(){
		return "This is Sai Pavan";
	}
}

class pavan extends Sai{
	int new_age = 20;
}


class saipavan extends pavan{
	int fin_age = 21;
	public static void main(String[] args){
		saipavan obj_new = new saipavan();
		System.out.print(obj_new.age+" ");
		System.out.print(obj_new.new_age+" ");
		System.out.print(obj_new.fin_age);
	}
}