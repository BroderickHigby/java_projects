import java.util.HashMap;
import java.util.Map.Entry;
/**
 * @author brody
 *
 */
public class SymbolTable 
{
	private static String INITIAL_VALID_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_$.:";
	private static String ALL_VALID_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_$.:";
	private HashMap<String, Integer> symbolTable = new HashMap<String, Integer>(); 
	public SymbolTable() //DESCRIPTION: Initializes hashMap with predefined symbols 
	{ //PRECONDITION: The symbolTable HashMap is declared and initialized, and java.util.HashMap is imported 
		symbolTable.put("R0", 	  0);
		symbolTable.put("R1", 	  1);
		symbolTable.put("R2", 	  2);
		symbolTable.put("R3", 	  3);		
		symbolTable.put("R4", 	  4);
		symbolTable.put("R5",     5);
		symbolTable.put("R6", 	  6);
		symbolTable.put("R7", 	  7);
		symbolTable.put("R8", 	  8);
		symbolTable.put("R9", 	  9);
		symbolTable.put("R10", 	  10);
		symbolTable.put("R11",    11);		
		symbolTable.put("R12", 	  12);
		symbolTable.put("R13", 	  13);
		symbolTable.put("R14", 	  14);
		symbolTable.put("R15", 	  15);	
		symbolTable.put("SCREEN", 16384);
		symbolTable.put("KBD", 	  24576);		
		symbolTable.put("SP",  	  0);
		symbolTable.put("LCL", 	  1);
		symbolTable.put("ARG", 	  2);
		symbolTable.put("THIS",	  3);			
		symbolTable.put("THAT",	  4);	
	} //POSTCONDITION: All the symbols are added 
	
	public boolean addEntry(String symbol, int address)//Description: adds new pair of symbol/address to hashmap
	{//Pre-Condition: HashMap exists only called if entry isn't already in HashMap and a valid symbol 				
			if(contains(symbol))//If it  already exists in HashMap
			{	
				//System.out.println("contains(Symbol) is false");
				return false; 
			}
			if(!isValidName(symbol)) //If the symbol is not a valid name, then do not add it  
			{
				//System.out.println("!isValidName(Symbol) is false");
				return false;
			}
			symbolTable.put(symbol, address); //Then add it to the symbolTable
			return true;		
	}//PostCondition: The symbol from the inputed file is now added to the symbolTable hashmap
	
	public boolean contains(String symbol)//Description: returns boolean of whether hashmap has symbol or not
	{//PreCondition: symbol is in the symbol table
		return symbolTable.containsKey(symbol);
	}//PostCondition: returns true if the key is contained in the map
	public int getAddress(String symbol) //Description: a getter method to grab the address from the symbolTable 
	{//PreCondition: The symbol is already added to the symbol table and defined 
			return symbolTable.get(symbol);
	}//PostCondition: The symbol is called from the symbolTable and is publicly accessible
	
	public static boolean isValidName(String symbol)//Description: Checks validity of identifiers for assembly code symbols 
	{//Pre-condition: Starts with letters & allowed chars, letters , digits, and $,_,.,:
		boolean isValid = true; //Loop-control variable (LCV)
		int i = 1; //LCV (changed from int i = 1 to int i = 0 to test addEntry method
		char initialValue = symbol.charAt(0);
		if(symbol == null || symbol.length() == 0) //3/14 -12:36 added quotations 
		{
			//System.out.println("if there isn't a symbol, return notValid");
			//returns false 
			return !isValid;
		}
		//Checks validity of initial valid chars
		if(INITIAL_VALID_CHARS.indexOf(initialValue) == -1)
		{
			//System.out.println("If the first letter doesn't have A-Z, return false");
			isValid = false;
		}	
		while(isValid && i < symbol.length())  //Checks validity of all valid chars	
			{
				 char current = symbol.charAt(i);
				if(ALL_VALID_CHARS.indexOf(current) == -1)
				{
					//System.out.println("if there's a symbol that isn't true. ");
					//return !isValid;
					isValid = false;
				}					
			i++;	
			}
		return isValid; 
	}//Post-Condition: We get back a boolean value "true" if the name is valid
	
	public void allSymbols() //Description: a self-made table used to print the entire symbolTable list
	{//PreCondition: The symbol table is already adding the symbols it's input gives it
		for(Entry<String, Integer> symbolEntry: symbolTable.entrySet())
		{
			System.out.println(symbolEntry);
		}
	}//PostCondition: Provides the symbolTable for output for debugging purposes
}
