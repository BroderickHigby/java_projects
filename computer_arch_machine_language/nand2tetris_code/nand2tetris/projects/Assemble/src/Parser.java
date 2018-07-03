import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**@author Broderick Higby
 * Break the command into it's underlying fields 
 */

/**Parser Attack Plan:
 * 1. create variables 
 * 2. take in file from assembler 
 * 3. Line number is going to increment for the symbolTable, use a for() loop
 * 4. rawLine is our helper method
 */
public class Parser 
{	//Commands from each line of code
	public static final char NO_COMMAND = 'N';
	public static final char A_COMMAND = 'A';	
	public static final char C_COMMAND = 'C';  
	public static final char L_COMMAND = 'L';  
	
	//TODO: pull the inputFileName from the assembler class
	private Scanner inputFile; //For pulling in the file
	
	private int lineNumber = 0;
	private String rawLine = null;
	//Note: The 3 values below need to be stored 
	private String cleanLine = null;
	private char commandType; 
	private String symbol = null;
	private String destMnemonic;
	private String compMnemonic;
	private String jumpMnemonic;

	
	
	//Driver methods
	//TODO: fix your parse method*****************
	public Parser(String inFileName) throws IOException//opens input file/stream and prepares to parse  
	{//PreCondition: fileName is error-checked 
		
		inputFile = new Scanner(new FileInputStream(inFileName));

		//Use FileinputStream and Scanner class
		//call inputFileName from Assembler and assign it the inputFile
	}//PostCondition: The file is usable in the Parser class now 

	public boolean hasMoreCommands()//Description: Returns boolean if more commands left, closes stream if not 
	{//Pre-Condition: Code is inputed, iterates through HACK code, has valid file
		if(inputFile.hasNextLine())
		{//check code using hasNext
			return true;
		}
		else
		{
			inputFile.close();
			return false;
		}
	}//Post-Condition: Returns boolean, closes stream when done iterating
	public void advance() //Description: reads next line from file and parses it into vars
	{//Pre-Condition:
		
		rawLine = inputFile.nextLine();
		cleanLine(); 
		//System.out.println("advance -> cleanLine(): " + cleanLine);
		parse(); 
//		lineNumber++; System.out.println("advance -> lineNumber++ " + lineNumber);
	}//Post-Condition:
	
	//These are the parsing helpers 
	private void cleanLine()//Description: Cleans raw instruction by removing non-essential parts  
	{//Pre-Condition: Comments are embedded after lines of code, white space needs to be trimmed
		
		String clean = rawLine;
		int commentLine = clean.indexOf("//");  //Gets comments
		if(commentLine != -1) //indexOf returns -1 if no number exists
		{
			clean = clean.substring(0, commentLine);
			//System.out.println("cleanLine() if cleanLine & no number exists: " + clean);
		}

		clean = clean.replaceAll(" ",""); 
		//System.out.println("replaces all spaces with no space and returns a clean line: " + clean);
		cleanLine = clean.trim();
		//System.out.println("Trims the line " + cleanLine);
		
	}//Post-Condition: Comments are removed and white space is trimmed 
	private void parseCommandType()//Description: Determine command type from parameter
	{//Pre-Condition: Given a clean line that is ready to be parsed 
		if(cleanLine.indexOf("@") == 0)
		{
			commandType = A_COMMAND; 
			//System.out.println("The a-command if it has an @ symbol: " + commandType);
			lineNumber++;// System.out.println("parseCommandType() -> A_Command -> lineNumber++ " + lineNumber);

		}
		else if(cleanLine.length() == 0 || cleanLine == "null") //Check if the length is 0 or "null" then modify code to include exception
		{
			commandType = NO_COMMAND;	//System.out.println("No-command if the length is 0 or the string is null: " + commandType);
		}
		else if(cleanLine.startsWith("(") && cleanLine.endsWith(")"))
		{
		 	commandType = L_COMMAND; //Label
		 	//System.out.println("The L-command if the cleanLine starts with ( and ends with ): " + commandType);
		}
		else
		{
			commandType = C_COMMAND; //everything else would logically be a C-inst.
			//System.out.println("Everything else should logically be a c-command " + commandType);
			lineNumber++; //System.out.println("parseCommandType() -> C_Command -> lineNumber++ " + lineNumber);

		}
	}//Post-Condition: returns char; check for instruction
	private void parse()/*Description: Parses the different instructions based on their characteristics, 
							Labels get their parenthesis parsed and added, maybe then, they'll be valid*/
	{//Pre-Condition: The lines that are being inputted are already clean
		//if commandType, then select whatever command it is
		parseCommandType();
		if(commandType == A_COMMAND)
		{
			parseSymbol();
			//System.out.println("if commandType is an A, then call parseSymbol() println doesn't output");
		}
		else if (commandType == L_COMMAND) // I parse my L_COMMAND commandType using the parse method instead of the parseSymbol
		{
			symbol = cleanLine.substring(1, cleanLine.length() - 1); 
			//System.out.println("if a L commandType, then call use cleanLine substring 1 to cleanline.length - 1: " + symbol);

		}
		else if(commandType == C_COMMAND)
		{
			parseDest();
			parseComp();
			parseJump();
			//System.out.println("If C_command then execute parseDest(), parseComp, and parseJump");
			
		}
	}//Post-Condition: All commands are properly parsed and ready to be turned into binary
	private void parseSymbol()//Description: Getter for symbol name
	{//Pre-Condition: only takes in a -instructions, because it is only called upon by parse()
		if(commandType == A_COMMAND)
		{
			symbol = cleanLine.substring(1);
		}
		else if(commandType == A_COMMAND)
		{
			
		}
		else if(commandType == L_COMMAND)
		{
			symbol = cleanLine.substring(1, cleanLine.length() - 1); //(LABEL)
			//System.out.println("Label symbol" + symbol);
		}
		//System.out.println("parseSymbol() calls cleanLine.substring(1) acting as a getter for the symbol name, this may be the problem: " + symbol);
		/** My firstPass is not taking in the symbols, what the problem might be is that my addEntry method isn't recognizing the names 
		 * as valid because the last parenthesis is still in the name, when I'm parsing the labels i.e. INFINITE_LOOP)<---
		 * So what I'm going to do is change this substring to take in the last value and see how that affects the other methods that call
		 * this. If they affect it too much, then I'm going to create a new method just for parsing Labels
		 */
	}//Post-Condition: symbol has the a-instruction values after the @symbol
	
	//Parses C-instruction into dest, comp, and jump
	private void parseJump()//Description: This is in charge of returning a clean string to be translated to binary
	{//Pre-Condition: The inputted assembly instructions are correct
		//Code jump = new Code();
		int semi = cleanLine.indexOf(";");
		String cleanJump;
		if(semi == 1) //before the semi-colon,
		{
			cleanJump = cleanLine.substring(semi + 1); //Prevents the jump strings from returning null 
			jumpMnemonic = cleanJump;
		}
		else if(cleanLine.indexOf("=") != -1)
		{
			jumpMnemonic = "null";
		}


	}//Post-Condition: A "jumpMnemonic" string is returned allowing the code to be 
	private void parseComp()//Description: parses the string after the equals sign to the end
 	{//Pre-Condition: a clean line with no spaces
		int eq = cleanLine.indexOf("=");
		int semi = cleanLine.indexOf(";");
		String cleanComp;
		if(semi == -1)
		{
			cleanComp = cleanLine.substring(eq + 1, cleanLine.length());
		}
		else
		{
			cleanComp = cleanLine.substring(0, semi);
		}
		compMnemonic = cleanComp;
		
	}//Post-Condition: the condition after the equals sign with no semi-colon
	private void parseDest()//Description: parses the string so it can be used later to be turned into binary
	{//Pre-Condition: A clean string with no spaces 
		int eq = cleanLine.indexOf("=");
		int semi = cleanLine.indexOf(";");
		if(eq != -1)
		{
			destMnemonic = cleanLine.substring(0, eq);
		}
		else if(semi != -1)//If cleanLine has a semi-colon, then return null string
		{
			destMnemonic = "null"; //This converts null strings to binary
		}
		
	}//Post-Condition: The command is cleaned and there is no semi-colon

	//Useful getters 
	public char getCommandType() //Description: A getter for commandType
	{//Pre-Condition: CommmandType is already defined and corresponds to it's correct symbol
		return commandType;
	}//Post-Condition: CommandType is able to be accessed
	public String getSymbol() //Description: A getter for the symbol
	{//Pre-Condition: A clean symbol is already defined
		return symbol;
	}//Post-Condition:	The symbol variable is accessed
	public String getDest() //Description: a getter for dest part of C-instruction
	{//Pre-Condition: a string that is void of unneccessatry parts
		return destMnemonic;
	}//Post-Condition:The destMnemonic variable is accessible 
	public String getComp() //Description: A getter for the comp part of C-Instruction
	{//Pre-Condition: A string that is void of unnneccessary parts 
		return compMnemonic;
	}//Post-Condition: The compMnemonic variable is publically accessible
	public String getJump() //Description: A getter for the jump part of C-instruction
	{//Pre-Condition: The jump string is void of unneccessary parts
		return jumpMnemonic;
	}//Post-Condition: The jumpMnemonic variable is publically accessible
	
	
	public char getCommandTypeString() //Description: Getter for string version of commandType (debugging) 
	{//Pre-Condition: CommandType is pre-defined and gives the proper string
		return commandType;
	}//Post-Condition: The commandTypeString is returned when called upon
	public int getLineNumber() //Description: getter for LineNumber (debugger)
	{//Pre-Condition:You have the lineNumber variable declared and accessible 
		return lineNumber;
	}//Post-Condition: The lineNummer is publicly accessible for debugging when called upon
	public String getRawLine() //Description: getter for rawLine from file (debugging) 
	{//Pre-Condition: The rawLine variable is declared and is holding the raw data, pre cleanLine	
		return rawLine;
	}//Post-Condition: The rawLine variable is publiclly accessible
	public String getCleanLine() //Description: A getter for the cleanLine from the file (debugging) 
	{//Pre-Condition: the line is already completely wiped of unnecceesarry elements
		return cleanLine;
	}//Post-Condition: the cleanLine is publicclly accessible via this method
}
