public class Comedy extends Movie{
	protected boolean funny;

	public Comedy(String name, String director, boolean funny) {
		super(name, director);
		this.funny = funny;
	}

	public boolean isFunny() {
		return funny;
	}

	public void setFunny(boolean funny) {
		this.funny = funny;
	}
}

