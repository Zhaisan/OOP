package problem2;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		
		
		HashSet<Android> ad = new HashSet<Android>();
		
//		ad.add(new Android("Mobile", "Kotlin"));
		ad.add(new AdvancedAndroid("Mobile dev", "Kotlin", "OOP Style"));
		
		System.out.println(ad);
		
	}

}
