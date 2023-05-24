
public class SalamiMeat extends IngredientDecorator {

	public SalamiMeat(Menu item) {
			this.wrappedObject = item;
			this.price = 2.0f;
			this.description = "Salami";
		}

	@Override
	public float cost() {
			
		return this.price + this.wrappedObject.cost();
	}

	@Override
	public String getDescription() {
			
		return this.description + ", " + this.wrappedObject.getDescription();
	}
}
