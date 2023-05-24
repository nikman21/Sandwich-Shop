public class PepperJackCheese extends IngredientDecorator {

	public PepperJackCheese(Menu item) {
		this.wrappedObject = item;
		this.price = 0.5f;
		this.description = "Peperjack Cheese";
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
