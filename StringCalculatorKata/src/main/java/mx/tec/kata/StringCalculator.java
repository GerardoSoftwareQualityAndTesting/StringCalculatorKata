package mx.tec.kata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

  public int add(String numbers) {
    if (!numbers.isBlank()) {
    	if(numbers.startsWith("//")) {
    		Pattern pattern = Pattern.compile("(?<=\\/\\/)(.*)(?=\\n)");
    		Matcher matcher = pattern.matcher(numbers); 
    		
    		if (matcher.find()) {
    			String delimiter = matcher.group(1);
    			int sum = 0;
    			String[] splitNumbers = numbers.split("\\n")[1].split(delimiter);
        		for (String numString : splitNumbers) {
        			sum += Integer.parseInt(numString);
        			}
        		return sum;
    		} else {
    			return 0;
    		}} else {
    		String[] splitNumbers = numbers.split("\\n|,");
    		int sum = 0;
    		for (String numString : splitNumbers) {
    			sum += Integer.parseInt(numString);
    			}
    		return sum;
    		}
    	} else return 0;
    }
  }
