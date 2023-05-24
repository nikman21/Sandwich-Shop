import java.util.Scanner;

public class SandwhichShop {
	
	private SandwhichFactory factory;

	public SandwhichShop() 
	{
		this.factory = new SandwhichFactory();
	}
	
	public Menu orderSize()
	{
		Scanner input = new Scanner(System.in);
		int choice = 0;
		boolean isValidChoice = false;

		while (!isValidChoice) {
			showSizes();
		    choice = input.nextInt();

		    if (choice >= 1 && choice <= 3){
		    	isValidChoice = true;
		    }
		    else{
		    	System.out.println("Invalid size choice. Please choose again.");
		    }
		 }

		Menu mySandwich = factory.sizeSandwhich(choice);
		return mySandwich;
	}
	
	private void showSizes()
	{
		System.out.println("Choose your size: ");
		System.out.println("1: Small Sandwhich (6 inches)");
		System.out.println("2: Medium Sandwhich (12 inches)");
		System.out.println("3: Large Sandwhich (18 inches)");
		System.out.println(">: ");
	}
	
	public Menu orderMeat()
	{
	    Scanner input = new Scanner(System.in);
	    boolean validChoice = false;
	    int choice = 0;
	    while(!validChoice) {
	        showMeat();
	        choice = input.nextInt();
	        if(choice >= 1 && choice <= 3) {
	            validChoice = true;
	        } else {
	            System.out.println("Invalid meat choice. Please try again.");
	        }
	    }
	    Menu mySandwich = factory.meatSandwhich(choice);
	    return mySandwich;
	}

	
	private void showMeat()
	{
		System.out.println("Choose your type of meat: ");
		System.out.println("1: Ham");
		System.out.println("2: Turkey");
		System.out.println("3: Salami");
		System.out.print(">: ");
	
	}
	
	public Menu orderCheese() {
	    Scanner input = new Scanner(System.in);
	    boolean validInput = false;
	    int choice = 0;
	    
	    while (!validInput) {
	        showCheese();
	        choice = input.nextInt();
	        
	        if (choice < 1 || choice > 3) {
	            System.out.println("Invalid cheese choice. Please choose again.");
	        } else {
	            validInput = true;
	        }
	    }
	    
	    Menu mySandwich = factory.cheeseSandwhich(choice);
	    return mySandwich;
	}

	
	private void showCheese()
	{
		System.out.println("Choose your type of cheese: ");
		System.out.println("1: American");
		System.out.println("2: Swiss");
		System.out.println("3: Pepperjack");
		System.out.print(">: ");
	
	}
	
	public Menu orderToppings() {
	    Scanner input = new Scanner(System.in);
	    boolean validInput = false;
	    int[] toppings = null;
	    while (!validInput) {
	        showToppings();
	        String[] choices = input.nextLine().split(" ");
	        
	        toppings = new int[choices.length];
	        boolean allChoicesValid = true;
	        for (int i = 0; i < choices.length; i++) {
	            int choice = Integer.parseInt(choices[i]);
	            if (choice < 1 || choice > 4) {
	                allChoicesValid = false;
	                System.out.println("Invalid topping choice: " + choice);
	                break;
	            } else {
	                toppings[i] = choice;
	            }
	        }
	        if (allChoicesValid) {
	            validInput = true;
	        }
	    }
	    
	    Menu sandwichWithToppings = factory.toppingSandwhich(toppings);
	    return sandwichWithToppings;
	}

	
	private void showToppings()
	{
		System.out.println("Choose your toppings: ");
		System.out.println("1: Lettuce");
		System.out.println("2: Onion");
		System.out.println("3: Pickles");
		System.out.println("4. Tomato");
		System.out.print(">: ");
	}
}
