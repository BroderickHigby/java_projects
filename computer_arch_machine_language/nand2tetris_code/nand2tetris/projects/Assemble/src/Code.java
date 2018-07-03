/**Code: Translates each field into its corresponding binary value, and assembles the resulting values
 * 
 */

/**
 * @author Broderick Higby
 *
 */
import java.util.HashMap;

public class Code 
{
	//Initializing the different codes 
	private HashMap<String, String> compCodes = new HashMap<String, String>();
	private HashMap<String, String> destCodes = new HashMap<String, String>();
	private HashMap<String, String> jumpCodes = new HashMap<String, String>();

	public Code() //Description: Initializes HashMaps with binary codes for easy lookup
	{//PreCondition: HashMap is imported and string is cleaned without spaces
		//Instance variables of the HashMap Object
		compCodes = new HashMap<String, String>();
		destCodes = new HashMap<String, String>();
		jumpCodes = new HashMap<String, String>();
		//A = 0				  A123456
		compCodes.put("0",   "0101010");
		compCodes.put("1",   "0111111");
		compCodes.put("-1",  "0111010");
		compCodes.put("D",   "0001100");
		compCodes.put("A",   "0110000");
		compCodes.put("!D",  "0001101");
		compCodes.put("!A",  "0110001");
		compCodes.put("-D",  "0001111");
		compCodes.put("-A",  "0110011");
		compCodes.put("D+1", "0011111");
		compCodes.put("A+1", "0110111");
		compCodes.put("D-1", "0001110");
		compCodes.put("A-1", "0110010");
		compCodes.put("D+A", "0000010");
		compCodes.put("D-A", "0010011");
		compCodes.put("A-D", "0000111");
		compCodes.put("D&A", "0000000");
		compCodes.put("D|A", "0010101");
		//These are the M-values A=1  A123456     
		compCodes.put("D|M", "1010101"); //DAMN THIS ONE LINE OF CODE HAD ME TRIPPING FOR HOURS!!!
		compCodes.put("D&M", "1000000");
		compCodes.put("M-D", "1000111");
		compCodes.put("D-M", "1010011");
		compCodes.put("D+M", "1000010");
		compCodes.put("M-1", "1110010");
		compCodes.put("M+1", "1110111");
		compCodes.put("-M",  "1110011");
		compCodes.put("!M",  "1110001");
		compCodes.put("M",   "1110000");
		//These are the three digit dest-codes
		destCodes.put("null", "000");
		destCodes.put("M",    "001");
		destCodes.put("D",    "010");
		destCodes.put("MD",   "011");
		destCodes.put("A", 	  "100");
		destCodes.put("AM",   "101");
		destCodes.put("AD",   "110");
		destCodes.put("AMD",  "111");
		//These are the three digit jump-codes		
		jumpCodes.put("null",  "000");
		jumpCodes.put("JGT",   "001");
		jumpCodes.put("JEQ",   "010");
		jumpCodes.put("JGE",   "011");
		jumpCodes.put("JLT",   "100");
		jumpCodes.put("JNE",   "101");
		jumpCodes.put("JLE",   "110");
		jumpCodes.put("JMP",   "111");	
	} //PostCondition: All HashMaps have look-ups for valid codes 
	public String getComp(String mnemonic) //Description: converts to string of bits (7) for given mnemonic
	{ //PreCondition: comp code is already in seven digit format
		if(compCodes.containsKey(mnemonic));
		{
			return compCodes.get(mnemonic);
		}
	}//PostCondition: The comp code is publically accessible
	public String getDest(String mnemonic) //Description: converts to string of bits (3) for given mnemonic
	{ //PreCondition: the dest code is already defined 
		if(destCodes.containsKey(mnemonic));
		{
			return destCodes.get(mnemonic);
		}
	}//PostCondition: The dest code is publically accessible
	public String getJump(String mnemonic) //Description: converts to string of bits (3) for given mnemonic
	{//PreCondition: The jump code is already defined
		if(jumpCodes.containsKey(mnemonic));
		{
			return jumpCodes.get(mnemonic);
		}
	}//PostCondition: The jump code is publically accessible
	//Description: converts integer from decimal notation to binary notation
	public static String decimalToBinary(int decimal) 
	{//Pre-condition: A non-negative integer less than 2^15, first char is MSB
		int remainder;
		String result = "";
		for(int i = 0; i < 15; i++)
		{
			remainder = decimal % 2;
			decimal = decimal / 2;
			result = remainder + result; //concatenates binary digits from LSB to MSB
		}//Post-Condition: A string that holds binary digits 
		return result;
	}
}
