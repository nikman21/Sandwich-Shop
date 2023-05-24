
public class LargeSandwhich extends Menu {

	public LargeSandwhich() {
			this.price = 6.0f;
			this.description = "Large Sandwhich (18 inches)";
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
