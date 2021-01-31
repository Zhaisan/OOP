package first_week;

import java.util.Scanner;
public class FifthProblem{
    public static boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
                
            }
            l++; 
            r--;
        }

        return true;
        
    }
     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if(isPalindrome(s)){
            System.out.println("Palindrome");
            
            
        }
        else{
            System.out.println("Not a palindrome");
        }
        
     }
}