package assignment04;

public class MultipleEx {

	public static void main(String[] args) {
		
		System.out.print("   "+"|"+" ");
		for(int i=1; i<=9; i++) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("---+--------------------------------------------------------");
		for(int j=1; j<=9; j++) {
			System.out.print(j+"  | ");
			for(int k=1; k<=9; k++) {
				System.out.print((j*k)+"\t");
			}
			System.out.println();
		}
	}

}
