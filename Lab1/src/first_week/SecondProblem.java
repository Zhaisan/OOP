package first_week;
import java.util.Scanner;

public class SecondProblem {
	public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println("area: " + a * a + "\n" + "perimeter: " + 4 * a + "\n" + "diagonal: " + Math.sqrt(2) * a);

     }

}