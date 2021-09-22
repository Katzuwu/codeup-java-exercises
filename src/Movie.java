public class Movie {
	private String name;
	private String director;

	public Movie(String name, String director){
		this.name = name;
		this.director = director;
	}

	public String getDirector() {
		return director;
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
