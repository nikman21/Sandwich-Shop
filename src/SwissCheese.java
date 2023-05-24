
public class SwissCheese extends IngredientDecorator {

	public SwissCheese(Menu item) {
		this.wrappedObject = item;
		this.price = 0.5f;
		this.description = "Swiss Cheese";
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
