package first_week;
import java.util.Scanner;

public class ThirdProblem {
	public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int grade = in.nextInt();
        if(grade >= 95 && grade <= 100){
            System.out.println("A+");
        }
        else if(grade >= 90 && grade < 95){
            System.out.println("A-");
        }
        else if(grade >= 85 && grade < 90){
            System.out.println("B+");
        }
        else if(grade >= 80 && grade < 85){
            System.out.println("B");
        }
        else if(grade >= 75 && grade < 80){
            System.out.println("B-");
        }
        else if(grade >= 70 && grade < 75){
            System.out.println("C+");
        }
        else if(grade >= 65 && grade < 70){
            System.out.println("C");
        }
        else if(grade >= 60 && grade < 65){
            System.out.println("D+");
        }
        else if(grade >= 55 && grade < 60){
            System.out.println("D");
        }
        else if(grade >= 50 && grade < 55){
            System.out.println("D-");
        }
        else{
            System.out.println("F");
        }

     }


}
