package problem3;

public class Position {
	
	int index1;
	int index2;
	
	public Position(String position) {
		
		char a = position.charAt(0);
		int number  = 0;
		
		if (a == 'A') number = 1;
		else if (a == 'B') number = 2;
		else if (a == 'C') number = 3;
		else if (a == 'D') number = 4;
		else if (a == 'E') number = 5;
		else if (a == 'F') number = 6;
		else if (a == 'G') number = 7;
		else if (a == 'H') number = 8;
		
		this.index1 = number;
		this.index2 = Character.getNumericValue(position.charAt(1));
	}
	
	public boolean outOfBorder() {
		if (index1 < 1 || index1 > 8) {
			return true;
		}
		else if (index2 < 1 || index2 > 8) {
			return true;
		}
		return false;
	}

}
