public class MaxMinScore {
	public static void main (String[] args){
		int i;
		int passed = 0;
		int failed = 0;
		int [] marks = {55, 64, 32, 78, 92, 74, 28,63, 48, 59};
		int minimum = marks[0];
		int maximum = marks[0];
		for(i=0; i<10; i++){
			if (marks[i] < minimum) {
				minimum = marks[i];
			}
		}
		System.out.println("Lowest = " +minimum);	
		
		for(i=0; i<10; i++){
			if (marks[i] > maximum) {
				maximum = marks[i];
			}
		}
		System.out.println("highest = " +maximum);
		
		for (i=0; i<marks.length; i++){
			if(marks[i]<40) {
				failed+=1;
			}
			else {
				passed+=1;
			}
		}
		System.out.println("passed = " +passed + " Failed = " +failed);
	}
}
