class asc{
	public static void main(String[] args){
		String name[] = {"banana", "apple", "cat"};
		String alp = "abcdefghijklmnopqrstuvwxyz";
		System.out.print("Ascending Order : ");
		String[] out = new String[3];
		int k=0;
		for(int i=0;i<alp.length();i++){
			for(int j=0;j<name.length;j++){
				if(alp.charAt(i)==name[j].charAt(0)){
					System.out.print(name[j]+" ");
					out[k] = name[j];
					k++;
				}
			}
		}
		System.out.println();
		System.out.print("Descending Order : ");
		for(int i=2;i>=0;i--){
			System.out.print(out[i]+" ");
	}
}
}

/*
Applications:
1) Sorting Algorithms
2) Sequences
3) Decision Making
4) Clinical Trials
*/