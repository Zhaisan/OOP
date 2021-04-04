package problem2;
import java.util.Objects;

public class AdvancedAndroid extends Android{
	
	private String style;

	public AdvancedAndroid (String direction, String language, String style) {
		super(direction, language);
		this.style = style;
	}
	
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		AdvancedAndroid advancedandroid = (AdvancedAndroid)o; 
		return this.style.equals(advancedandroid.style);
		
	}
	
	public int hashCode() {
		return Objects.hash(super.hashCode(), style);
	}
	
	public String toString() {
		return super.toString() + "style: " + style;
	}

}
