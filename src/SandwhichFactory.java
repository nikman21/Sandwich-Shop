public class SandwhichFactory {
 	private Menu sandwhich;
	public SandwhichFactory() {}
	
	public Menu sizeSandwhich(int type){
		
		switch (type){
		case 1: 
			sandwhich = new SmallSandwhich();
			break;
		case 2: 
			sandwhich = new MediumSandwhich();
			break;
		case 3: 
			sandwhich = new LargeSandwhich();
			break;
		default:
			System.out.println("Invalid size");
			break;
		}
		return sandwhich;
	}
	public Menu meatSandwhich(int type){
		switch (type){
		case 1: 
			sandwhich = new HamMeat(sandwhich);
			break;
		case 2: 
			sandwhich = new TurkeyMeat(sandwhich);
			break;
		case 3: 
			sandwhich = new SalamiMeat(sandwhich);
			break;
		default:
			System.out.println("Invalid meat choice");
			break;
		}
		return sandwhich;
	}
	
	public Menu cheeseSandwhich(int type){
		switch (type){
		case 1: 
			sandwhich = new AmericanCheese(sandwhich);
			break;
		case 2: 
			sandwhich = new SwissCheese(sandwhich);
			break;
		case 3: 
			sandwhich = new PepperJackCheese(sandwhich);
			break;
		default:
			System.out.println("Invalid cheese choice");
			break;
		}
		return sandwhich;
	}
	public Menu toppingSandwhich(int[] toppings){
		for(int topping : toppings) {
			switch (topping){
				case 1: 
					sandwhich = new LettuceTopping(sandwhich);
					break;
				case 2: 
					sandwhich = new OnionTopping(sandwhich);
					break;
				case 3: 
					sandwhich = new PickleTopping(sandwhich);
					break;
				case 4:
					sandwhich = new TomatoTopping(sandwhich);
					break;
				default:
					System.out.println("Invalid topping choice");
					break;
			}
		
		}
		return sandwhich;
	}
}
