/**
 Program Name: String Processing Demo
 Author: Broderick Higby
 Date: 1/23/2015
 Description: Displays use of String names
 */
public class StringProcessingDemo {

	public static void main(String[] args) {
		//Initial statement 
		String sentence = "I hate text processing";
		//Variable declaration "hate"
		int position = sentence.indexOf("hate");
		String ending =
				sentence.substring(position+"hate".length());
		System.out.println("01234567890123456789012");
			System.out.println("The word \"hate\" starts at index"
														+ position);
			//bringing sentence string to substring, also connecting position
			sentence=sentence.substring(0, position) +"adore"
													+ending;
			System.out.println("The changed string is:");
			//The final product below
			System.out.println(sentence);
	}

}
