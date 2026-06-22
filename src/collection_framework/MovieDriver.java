package collection_framework;

import java.util.*;

public class MovieDriver {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Movie[]movies = new Movie[13];
		movies[0]=(new Movie(101, "Intestellar", 2.34,3, 5, "English"));
		movies[1]=(new Movie(101, "Interstellar", 2.34, 3, 5, "English"));
		movies[2]=(new Movie(102, "Inception", 2.28, 4, 5, "English"));
		movies[3]=(new Movie(103, "Baahubali", 2.39, 6, 5, "Telugu"));
		movies[4]=(new Movie(104, "3 Idiots", 2.50, 8, 5, "Hindi"));
		movies[5]=(new Movie(105, "Jailer", 2.48, 5, 4, "Tamil"));
		movies[6]=(new Movie(106, "Parasite", 2.12, 0, 5, "Korean"));
		movies[7]=(new Movie(107, "The Dark Knight", 2.32, 2, 5, "English"));
		movies[8]=(new Movie(108, "Kantara", 2.30, 4, 5, "Kannada"));
		movies[9]=(new Movie(109, "Your Name", 1.46, 3, 4, "Japanese"));
		movies[10]=(new Movie(110, "Dangal", 2.41, 6, 5, "Hindi"));
		movies[11]=(new Movie(111, "KGF Chapter 1", 2.36, 5, 4, "Kannada"));
		movies[12]=(new Movie(112, "Avatar", 2.42, 1, 5, "English"));
		
//		Arrays.sort(movies);
		
//		Arrays.sort(movies , new RatingComparator());
		Arrays.sort(movies , new SongsComparator());
		
		for(Movie m : movies) {
			System.out.println(m);
		}
	}
}
