public class Movie implements Entertains{
	// 4. Create a class called Movie. The class should define two instance variables of type String named name and director. Add a constructor that takes two strings and sets the name and director properties based on the passed arguments. Make it so the instance variables are not accessible from outside the Movie class. Write getters and setters for the instance variables.

	// Bonus: if the passed name or director arguments are null or empty, the constructor should throw an IllegalArgumentException
	private String name;
	private String director;

	public Movie(){

	}

	public Movie(String name, String director) throws IllegalArgumentException{
		this.name = name;
		this.director = director;
		if (name == null || name.isBlank())
			throw new IllegalArgumentException();

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


	@Override
	public String audienceReaction() {
		return "oooooooh " + getName() +" was so awesome!";
	}
}
