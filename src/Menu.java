/*
 *  Menu is the base class for the entire Decorator pattern.
 *  Concrete classes are going to inherit directly from this
 *  
 */
public abstract class Menu {
	  
	protected float price;
	protected String description;

	public Menu() {}
	
	public abstract float cost();
	public abstract String getDescription();

}
