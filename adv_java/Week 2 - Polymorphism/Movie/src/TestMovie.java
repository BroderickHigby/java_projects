public class TestMovie
{
	
	public static void main(String[] args)
	{
		//Rental array with three values
        Rental[] customers = new Rental[3];
        
        //These are the specifics for the movies with the values passed from the Rental class
        Rental customer1 = new Rental(30,3303231, 100,"PG-13","Transformers",'A');
        Rental customer2 = new Rental(31,8675309, 101, "R", "500 Days of Summer", 'D');
      	Rental customer3 = new Rental(32, 1190239, 102, "R", "Superbad", 'C');
	
		customers[0] = customer1;
		customers[1] = customer2;
		customers[2] = customer3;
				
		customers[0].writeOutput();
		customers[1].writeOutput();		
		customers[2].writeOutput();		
	}

}