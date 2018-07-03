import java.io.FileNotFoundException;

/*	Name: 		Broderick Higby
 * 	Due Date: 	March 7, 2016
 *  Class:		T/Th 
 */
//TODO: don't forget to document each method in all classes!

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Assembler 
{	
	// ALGORITHM:
	// TODO: get input file name
	// TODO: create output file name and stream
	// TODO: create symbol table
	// TODO: do first pass to build symbol table (no output yet!)
	// TODO: do second pass to output translated ASM to HACK code
	// TODO: print out "done" message to user
	// TODO: close output file stream
	public static void main(String[] args) {
		
		String inputFileName, outputFileName;
		PrintWriter outputFile = null; //keep compiler happy
		SymbolTable symbolTable;
		//int romAddress, ramAddress; //Not used 

		//get input file name from command line or console input
		if(args.length == 1) {
			System.out.println("command line arg = " + args[0]);
			inputFileName = args[0];
		}
		else
		{
			Scanner keyboard = new Scanner(System.in);

			System.out.println("Please enter assembly file name you would like to assemble.");
			System.out.println("Don't forget the .asm extension: ");
			inputFileName = keyboard.nextLine();
					
			keyboard.close();
		}
		
		outputFileName = inputFileName.substring(0,inputFileName.lastIndexOf('.')) + ".hack";
		

			try {
				outputFile = new PrintWriter(new FileOutputStream(outputFileName));
			} catch (FileNotFoundException ex) {
				System.err.println("Could not open output file " + outputFileName);
				System.err.println("Run program again, make sure you have write permissions, etc.");
				System.exit(0);
			}
		symbolTable = new SymbolTable();
		firstPass(inputFileName, symbolTable);	
		secondPass(inputFileName, symbolTable,  outputFile);
		System.out.println("THIS IS THE NEW SYMBOL TABLE BELOW: ");
		symbolTable.allSymbols();
		// TODO: finish driver as algorithm describes
	}
	
	// TODO: march through the source code without generating any code
		//for each label declaration (LABEL) that appears in the source code,
		// add the pair <LABEL, n> to the symbol table
		// n = romAddress which you should keep track of as you go through each line
	//HINT: when should ROM address increase? What kind of commands?
	private static void firstPass(String inputFileName, SymbolTable symbolTable) 
	{

		Parser par = null; //calls the Parser class 
		try {
			par = new Parser(inputFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
		int romAddress = 0;
		
		while(par.hasMoreCommands())
		{
			par.advance();
			if(par.getCommandType() == Parser.L_COMMAND)
			{
				symbolTable.addEntry(par.getSymbol(), romAddress);
				//System.out.println( "Adding Label: " + "The ROM address is: " + romAddress + " the symbol from the parse method is: " + par.getSymbol());
			}
			else if(par.getCommandType() == Parser.NO_COMMAND)
			{	
				//System.out.println(romAddress + par.getCleanLine());
			}
			else
			{
				//System.out.println(romAddress + par.getRawLine());
				romAddress++;
			}	
		}	
	}
	
	// TODO: march again through the source code and process each line:
		// if the line is a c-instruction, simple (translate)
		// if the line is @xxx where xxx is a number, simple (translate)
		// if the line is @xxx and xxx is a symbol, look it up in the symbol
		//	table and proceed as follows:
			// If the symbol is found, replace it with its numeric value and complete the commands translation
			// If the symbol is not found, then it must represent a new variable:
				// add the pair <xxx, n> to the symbol table, where n is the next
				//	available RAM address, and complete the commands translation
	// HINT: when should rom address increase?  What should ram address start
	// at? When should it increase?  What do you do with L commands and No commands?
	private static void secondPass(String inputFileName, SymbolTable symbolTable, PrintWriter outputFile) 
	{
		String symbol = "";
		String toBinary = "";
		String forCCommand = "";
		 //Used for converting the second-pass C-Command to binary
		//BufferedWriter writeOut = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(out.getAbsoluteFile()), "UTF-8")
		Parser par = null; //calls the Parser class 
		Code code = new Code();
		int romAddress = 0;
		int ramAddress = 16;		
		
		try {
			par = new Parser(inputFileName);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		//Assembler.firstPass(inputFileName, symbolTable); //Added to pass through the firstPass
		while(par.hasMoreCommands())
		{ //If not an L-command or a No-Command, then it's either an A-Command or C-Command
			//If it is an A-Command then 
			par.advance(); //Advance through the commands
			
			if(par.getCommandType() == Parser.NO_COMMAND) //If the parser has no command
			{
				//System.out.println("Here's the No_command rom address" + romAddress + " " + par.getCleanLine());
			}
			else if(par.getCommandType() == Parser.A_COMMAND)
			{
				toBinary = "0"; //A-inst's start with binary
				try	//If it's a number then convert it to the address
				{
					symbol = par.getSymbol(); //Checks for the parsed symbol called from the symbolTable
					ramAddress = Integer.parseInt(symbol);//Parses the integer and returns an int
					toBinary += Code.decimalToBinary(romAddress); //converts the rest of the address to binary
					outputFile.write(toBinary + '\n'); //writes the file to the .hack program
					//System.out.println( "Adding a number: " + romAddress + par.getSymbol());
					//System.out.println(toBinary + par.getRawLine()); //printTest
				}catch(NumberFormatException e) //If not an integer, then it is a symbol
				{	//If it's an A-Command, then get the symbol and convert it to binary  
					if(symbolTable.contains(symbol))
					{ //If the symbol is found, replace it with its numeric value and complete the commands translation
						toBinary += Code.decimalToBinary(symbolTable.getAddress(symbol)); //calls the RAM address and gets the symbol 
						outputFile.write(toBinary + '\n');//writes the file to the .hack program
						//System.out.println("Write to binary if the symbol is found: " + toBinary);
					
					}
					else  //Otherwise, if it's not found in the symbolTable, then put it in the file
					{
						symbolTable.addEntry(symbol, ramAddress);
						toBinary += Code.decimalToBinary(ramAddress);
						outputFile.write(toBinary + '\n');
						//System.out.println("This adds the binary RAM Address: " + toBinary + " and the rawLine: " +par.getRawLine());
						//System.out.println("adding a symbol if it's not found " + symbol);		
					}	
				}	//If it's a symbol(i.e. 'n') then check that, call the address and then convert it to binary
			ramAddress++;
			}
			
			/**
			 * The issue I'm having right now is the assembler isn't adding the labels to the symbolTable. 
			 * Either that, or they are being added to the symbolTable and it's not checking to see if they
			 * are properly added already. Either way, when one label is added to the symbol table, a second one 
			 * is also added. 
			 */
			else if(par.getCommandType() == Parser.C_COMMAND)
			{ //Starts with "111" - rest of binary bits come from code class get methods
				//I'm going to call the code (getDest, getJump, getComp, accordingly and concatenate them
				//This concatenates the code as follows:  
			//111 (comp) a c1 c2 c3 c4 c5 c6 (dest) d1 d2 d3 (jump) j1 j2 j3 

				String compTest = code.getComp(par.getComp());
				String destTest = code.getDest(par.getDest());
				String jumpTest = code.getJump(par.getJump());
				
				//String o = Integer.toBinaryString(0x10000 | ramAddress).substring(1);
				//			111 (comp) a c1 c2 c3 c4 c5 c6 (dest) d1 d2 d3 (jump) j1 j2 j3 
				forCCommand = "111" + 	    compTest 		+ destTest 			+ jumpTest;
				//System.out.println(o);
				
				outputFile.write(forCCommand + '\n');//binary + compTest + destTest + jumpTest
				
				//System.out.println("C-Command: " + forCCommand);	
			}
			else
			{
//				System.out.println("This is the ROM address: " + romAddress + "This is the LineNumber: " + par.getLineNumber() + " This is the raw line: " 
//										+ par.getRawLine()	+ " and the cleanLine: " + par.getCleanLine());
				romAddress++;
			}
		}
		System.out.println("output done!");
	outputFile.close();
	}
}