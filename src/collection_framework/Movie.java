package collection_framework;

@SuppressWarnings("rawtypes")
public class Movie implements Comparable{
	private int id;
	private String name;
	private double duration;
	private int numberOfSongs;
	private int rating;
	private String language;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(short rating) {
		this.rating = rating;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Movie(int id, String name, double duration, int numberOfSongs, int rating, String language) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.numberOfSongs = numberOfSongs;
		this.rating = rating;
		this.language = language;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", duration=" + duration + ", numberOfSongs=" + numberOfSongs
				+ ", rating=" + rating + ", language=" + language + "]";
	}
	@Override
	public int compareTo(Object o) {
		Movie m = (Movie)o;
		return Double.compare(this.duration, m.duration);
	}
	
}
