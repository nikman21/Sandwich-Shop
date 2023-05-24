public abstract class IngredientDecorator extends Menu {
	protected Menu wrappedObject;
	
	public IngredientDecorator() {}

	abstract public float cost(); 
	abstract public String getDescription();
		

}
