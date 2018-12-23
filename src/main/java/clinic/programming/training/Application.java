package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
	    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public void greet() {
		List<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		for (String greeting: greetings) {
			System.out.println("Greeting: " + greeting);			
		}
	}

    public int countWords(String words) {
		String[] seperateWords = StringUtils.split(words,' ');
		return (seperateWords == null) ? 0 : seperateWords.length;
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		int count = app.countWords("I have four words");
		System.out.println("Word Count: " + count);
    }
}






