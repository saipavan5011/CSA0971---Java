import java.util.Scanner;

class demolition{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int first_dem, first_not, sec_dem, sec_not, third_dem, third_not, four_dem, four_not;
		System.out.println("Enter 1st Demolition : ");
		first_dem = sc.nextInt();
		System.out.println("Enter 1st Demolition number of notes : ");
		first_not = sc.nextInt();
		System.out.println("Enter 2nd Demolition : ");
		sec_dem = sc.nextInt();
		System.out.println("Enter 2nd Demolition number of notes : ");
		sec_not = sc.nextInt();
		System.out.println("Enter 3rd Demolition : ");
		third_dem = sc.nextInt();
		System.out.println("Enter 3rd Demolition number of notes : ");
		third_not = sc.nextInt();
		System.out.println("Enter 4rth Demolition : ");
		four_dem= sc.nextInt();
		System.out.println("Enter 4rth Demolition number of notes : ");
		four_not = sc.nextInt();
		int sum = 0;
		sum = (first_dem*first_not)+(sec_dem*sec_not)+(third_dem*third_not)+(four_dem*four_not);
		System.out.println("Total Sum : "+sum);
	}
}
