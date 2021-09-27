public class MovieTest {
	public static void main(String[] args) {
//		Movie movie = new Movie("", "");
		Comedy funny = new Comedy("Not funny", "didn't laugh", false);
		System.out.println(funny.getName() + " " + funny.getDirector() + " " + funny.isFunny());
		System.out.println(funny.audienceReaction());
	}
}
