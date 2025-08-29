package assign02;

public class MakeDiamond {

	public static void main(String[] args) {
		
		for(int i=0; i<9; i++) {
			// 마름모 상단 그리기
			if(i<=4) { 
				for(int j=-5; j<=5; j++) {
					if(Math.abs(j)<=i) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			// 마름모 하단 그리기
			else {
				for(int k=-5; k<=5; k++) {
					if(Math.abs(k)<=(-i+8)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}

	}

}
