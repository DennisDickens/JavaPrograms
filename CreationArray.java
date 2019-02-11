public class ArrayExample {
	public static void main(String[] args){
		int[] marks = {55, 60, 70, 34};
		int sum =0;
		double arg;
		for (int i=0; i<4; i++){
			sum = sum + marks[i];
		}
		arg = sum/4;
		System.out.println("Average sum = " +arg);
	}
}
