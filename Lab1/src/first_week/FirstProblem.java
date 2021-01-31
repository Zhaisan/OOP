package first_week;

public class FirstProblem {
	public static void main(String []args){
        
	    String name = "Zhaisan";
	    int n = name.length();
	    for (int i = 0; i < 3; i++) {
	      if (i == 1)
	            System.out.print('|');
	        else 
	            System.out.print('+');
	            
	      for (int j = 0; j < n; j++) {
	        if (i == 1) {
	          System.out.print(name);
	          break;
	        }
	        else 
	          System.out.print('-');
	      }
	      if (i == 1)
	          System.out.print("|\n");
	      else 
	          System.out.print("+\n");
	    }
	     }


}
