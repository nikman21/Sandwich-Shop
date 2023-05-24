
public class MediumSandwhich extends Menu {

	public MediumSandwhich() {
			this.price = 5.0f;
			this.description = "Medium Sandwhich (12 inches)";
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
