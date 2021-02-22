package problem1;
import java.util.Scanner;

public class Analyzer {
	
	public static void main(String []args){
		Data data = new Data();
		Scanner input = new Scanner(System.in);
		while(true) {
			String s = input.nextLine();
			if(s.equals("Q")) break;
			else data.addValue(Double.parseDouble(s));
		}
		
		System.out.println("Average = " + data.getAverage());
		System.out.println("Maximum = " + data.getMaximum());
		
		
		
	}
	

}
