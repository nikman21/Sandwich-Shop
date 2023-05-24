
public class TurkeyMeat extends IngredientDecorator {

	public TurkeyMeat(Menu item) {
			this.wrappedObject = item;
			this.price = 2.0f;
			this.description = "Turkey";
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
