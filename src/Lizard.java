public class Lizard {
	protected String name;

	public Lizard (String name) throws IllegalArgumentException{
		this.name = name;
		if (name == null || name.isBlank()){
			System.out.println("The name you entered is empty.");
			throw new IllegalArgumentException();
		}
	}
}
