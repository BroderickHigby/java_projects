/*Name: Broderick Higby
 *Chapter 8 project 2
 *September 6, 2015
 *Movie
 */
public class Movie {
	//Private ratings fields 
	private String gRated;
	private String pgRated;
	private String pg13Rated;
	private String rRated;
	private String IDNumber;
	private String movieTitle;
	
//Construction all up in dis code
	public Movie(String gRated, pgRated, pg13Rated, rRated, IDNumber, movieTitle)
	{
		this.gRated = gRated;
		this.pgRated = pgRated;
		this.pg13Rated = pg13Rated;
		this.rRated = rRated;
		this.IDNumber = IDNumber;
		this.movieTitle = movieTitle;
	}

}
