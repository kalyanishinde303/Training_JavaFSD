package Phase1.assestedPracticeProject;

import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		System.out.println ("kalyanishinde@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","kalyanishinde@gmail.com"));
		System.out.println ("nikki@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","nikki@gmail.com"));
		System.out.println ("test123prepare@co.edu.com : "+Pattern.matches("[a-z]+\\d{3}+[a-z]+[@][a-z]+.[a-z]+.[a-z]+","test123prepare@co.edu.com"));
		System.out.println ("9067168485 : "+Pattern.matches("\\d{10}","9619145671\n"));
		System.out.println ("Madhugadekar@99 : "+Pattern.matches("[SWA][a-z]+\\d{3}+[a-z0-9]+","Madhugadekar@99"));
		
	}

}

