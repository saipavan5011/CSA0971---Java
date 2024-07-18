import java.util.Scanner;
class search{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char ch = 'p';
		for(int i=0;i<line.length();i++){
			if(line.charAt(i)==ch){
				System.out.print(ch+" found at the index : "+(i+1));
			}
		}
	}
}
