package e1;

public class e_1_1 {

	public static void main(String[] args) {
		int temp = 0;
		
		int[] thous = new int[999];
		for(int i = 0 ; i < 1000; i++) {
			 if(i % 3 == 0 || i % 5 == 0) {
				 temp += i;
			 }

		}
		System.out.println(temp);
	}

}
