package problem2;
import java.util.Objects;

public class Android {

	private String direction;
	private String language;
	
	public Android() {};
	
	public Android(String direction, String language) {
		this.direction = direction;
		this.language = language;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		Android android = (Android)o;
		return (direction == android.direction) && this.language.equals(android.language);
	}
	
	public int hashCode() {
		return Objects.hash(direction, language);
	}
	
	public String toString() {
		return "IT direcion: " + direction + ", development language: " + language + ", ";
	}
}
