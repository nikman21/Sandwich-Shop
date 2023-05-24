
public class SmallSandwhich extends Menu {

	public SmallSandwhich() {
		this.price = 4.0f;
		this.description = "Small Sandwhich (6 inches)";
	}

	@Override
	public float cost() {
		
		return this.price;
	}

	@Override
	public String getDescription() {
		
		return this.description;
	}

}
