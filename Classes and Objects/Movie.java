
public class Movie {
	String title;
	String studio;
	String rating;
	static int j = 0;
	
	Movie(String title, String studio, String rating) {
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}
	
	Movie(String title, String studio) {
		this.title = title;
		this.studio = studio;
		this.rating = "PG";
	}
	
	public static Movie[] getPG(Movie[] movies) {
		Movie[] pgMovies = new Movie[movies.length];
		for(int i = 0; i < movies.length; i++) {
			if((movies[i].rating).equalsIgnoreCase("PG")) {
				pgMovies[j++] = movies[i];
				//System.out.println(j);
				//System.out.println(pgMovies[--j].toString());
			}
		}
		return pgMovies;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", studio=" + studio + ", rating=" + rating + "]";
	}

	public static void main(String[] args) {
		Movie movie = new Movie("Casino Royale", "Eon Productions", "PG-13");
		Movie movie1 = new Movie("Casino Royale", "Eon Productions");
		Movie movie2 = new Movie("dsg", "fgffbh");
		Movie movie3 = new Movie("fdnh", "fdhtrh fdf");
		
		Movie[] movies = {movie, movie1, movie2, movie3};
		
		Movie[] pgMovies = getPG(movies);
		for(int i = 0; i < j; i++) {
			System.out.println(pgMovies[i].toString());
		}
	}
}
