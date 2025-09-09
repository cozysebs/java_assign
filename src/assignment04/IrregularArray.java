package assignment04;

public class IrregularArray {

	public static void main(String[] args) {
		int intArray[][] = {{78,48,78,98},{99,92},{29,64,83},{34,78,92,56}};
		
		for(int i=0; i<intArray.length; i++) {
			int sum = 0;
			double avg = 0;
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j]+"\t");
				sum += intArray[i][j];
				avg = (double)sum/intArray[i].length;
			}
			System.out.print("sum:"+sum+"\t");
			System.out.print("avg:"+avg+"\t");
			System.out.println();
		}
	}

}
