/*
 * Nikolas Manuel
 * 
 * CPI 221 Selgrad
 * 
 * 03/24/2023
 * 
 * HW3: Our goal is to use a combination of the Decorator design pattern and the Factory
design pattern to create a simple store to purchase complex objects. This can be
entirely in the console using simple console input and output. The user should
be able to pick an item from the menu and then fill that item out with
ingredients until they are done.
 */

public class Manuel_shop {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to Sandwhich Galore!");
		
		System.out.println("Please begin your order:");
		
		SandwhichShop myshop = new SandwhichShop();
		
		Menu sandwhich = myshop.orderSize();
		
		sandwhich = myshop.orderMeat();
		sandwhich = myshop.orderCheese();
		sandwhich = myshop.orderToppings();
		
		
		String sandwichDescription = sandwhich.getDescription();
		String[] order = sandwichDescription.split(", ");

		System.out.println("Your Order");
		System.out.println("---------------------------------");

		System.out.println(order[order.length-1]);
		for (int i = 0; i < order.length; i++) {
			if(order[i] == order[order.length-1]) {
				break;
			}
		    System.out.println("   -- " + order[i]);
		}

		
		double subTotal = sandwhich.cost();
		double tax = Math.round(subTotal * 0.08 * 100.0) / 100.0;
		double total = subTotal + tax;
		System.out.println("Sub-total: $" + String.format("%.2f", subTotal));
		System.out.println("Tax: $" + String.format("%.2f", tax));
		System.out.println("Total: $" + String.format("%.2f", total));
		
		

	}

}
