package collection_framework;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class SongsComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Movie m1 = (Movie)o1;
		Movie m2 = (Movie)o2;
		
		return m1.getNumberOfSongs()-m2.getNumberOfSongs();
	}

}
