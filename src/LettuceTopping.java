
public class LettuceTopping extends IngredientDecorator {

	public LettuceTopping(Menu item) {
			this.wrappedObject = item;
			this.price = 0.25f;
			this.description = "Lettuce";
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
