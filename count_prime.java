import java.util.Scanner;

class count_prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int comp=0,pri=0;
		for(int i=0;i<10;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<10;i++){
			int coun = 0;
			for(int j=2;j<i;j++){
				if(i%j==0){
					coun = 1;
					comp++;
					break;
				}
			}
			if(coun==0){
				pri++;
			}
		}
		System.out.print("Prime Number : "+pri+", Composite Number : "+comp);
	}
}