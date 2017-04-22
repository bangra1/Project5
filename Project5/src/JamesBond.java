import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JamesBond {
	

	
public static boolean bondRegex(String value)

{


	    
	    
	    
	  String val = "";
	 for (int index = 0; index < value.length(); index++) {
	        val += (value.charAt(index)+" ");
	    }

		String testing = val; 
	    Pattern pattern = Pattern.compile("0 0 7");
	    Matcher matcher = pattern.matcher(testing);
	    if (matcher.find()) {
	        return true; 
	    } else {
	        return false;
	    }   
	    
	 
}

}
