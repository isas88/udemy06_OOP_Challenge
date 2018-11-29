package udemy06_OOP_Challenge;

public class Baseham {

	private String rolltype;
	private String meat;
	private int baseprice;
	private int price;
	private int lettuce$ = 2;
	private int tomato$ = 2;
	private int carrot$ = 2;
	private int egg$ = 2;
	private int spinach$ = 2;
	private int olives$ = 2;
	private int Chips$ = 2;
	private int Drinks$ = 2;
	
	private boolean lettuce;
	private boolean tomato; 
	private boolean carrot;
	private boolean egg;
	private boolean spinach;
	private boolean olives;
	private boolean Chips ;
	private boolean Drinks ;
	
	public Baseham(String rolltype, String meat, int baseprice) {
		this.rolltype =  rolltype;
		this.meat=  meat;
		this.baseprice = baseprice;
	}

	public void printtotal() {
		
		calcprice();
		
		System.out.println("Rolltype is :" +this.rolltype);
		
		System.out.println("Meat :" +this.meat);
		
		System.out.println("Baseprice: $" +this.baseprice);
		
		if (this.lettuce) {
			System.out.println("lettuce: $" +this.lettuce$ +" added");
		}
		
		if (this.tomato) {
			System.out.println("tomato: $" +this.tomato$ +" added");
		}
		
		if (this.carrot) {
			System.out.println("carrot: $" +this.carrot$ +" added");
		}
		
		if (this.egg) {
			System.out.println("egg: $" +this.egg$ +" added");
		}
		
		if (this.spinach) {
			System.out.println("spinach: $" +this.spinach$ +" added");
		}
		
		if (this.olives) {
			System.out.println("olives: $" +this.olives$ +" added");
		}
		
		if (this.Chips) {
			System.out.println("Chips : $" +this.Chips$ +" added");
		}
		
		if (this.Drinks) {
			System.out.println("Drinks: $" +this.Drinks$ +" added");
		}
		
		System.out.println("Total Price: $" +this.price);
		
	}
	
	public void additions(boolean lettuce, boolean tomato, boolean carrot, boolean egg) {
		this.lettuce = lettuce;
		this.tomato = tomato;
		this.carrot = carrot;
		this.egg = egg;
	}
	
	public void calcprice() {
		
		this.price = this.baseprice;
		if (this.lettuce) {
			this.price += this.lettuce$;
		}
		if (this.tomato) {
			this.price += this.tomato$;
		}
		if (this.carrot) {
			this.price += this.carrot$;
		}
		if (this.egg) {
			this.price += this.egg$;
		}
		if (this.spinach) {
			this.price += this.spinach$;
		}
		if (this.olives) {
			this.price += this.olives$;
		}
		if (this.Chips) {
			this.price += this.Chips$;
		}
		if (this.Drinks) {
			this.price += this.Drinks$;
		}

	}
	
	public void Baseprice() {
		System.out.println(this.baseprice);
	}

	public void setRolltype(String rolltype) {
		this.rolltype = rolltype;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setLettuce(boolean lettuce) {
		this.lettuce = lettuce;
	}

	public void setTomato(boolean tomato) {
		this.tomato = tomato;
	}

	public void setCarrot(boolean carrot) {
		this.carrot = carrot;
	}

	public void setEgg(boolean egg) {
		this.egg = egg;
	}

	public void setSpinach(boolean spinach) {
		this.spinach = spinach;
	}

	public void setOlives(boolean olives) {
		this.olives = olives;
	}

	public void setChips(boolean chips) {
		this.Chips = chips;
	}

	public void setDrinks(boolean drinks) {
		this.Drinks = drinks;
	}

	public void setBaseprice(int baseprice) {
		this.baseprice = baseprice;
	}
}
//***********************************************************************************
class Healthyham extends Baseham {
	
	private int baseprice;

	public Healthyham(String meat, int baseprice) {
		super("Brown Rye",meat, baseprice);
		setBaseprice(baseprice);	
		this.baseprice = baseprice;
	}

	public void additions(boolean lettuce, boolean tomato, boolean carrot, boolean egg, boolean spinach, boolean olives) {
		setLettuce(lettuce);
		setTomato(tomato);
		setCarrot(carrot);
		setEgg(egg);
		setSpinach(spinach);
		setOlives(olives);
	}
	
	public void Baseprice() {
		System.out.println(this.baseprice);
	}
}

//**********************************************************************************

class Deluxeham extends Baseham {

	private int baseprice;
		
	public Deluxeham(String rolltype, String meat, int baseprice, boolean Chips, boolean Drinks) {
		super(rolltype,meat,baseprice);
		setChips(Chips);
		setDrinks(Drinks);
		setBaseprice(baseprice);
		this.baseprice= baseprice;
	}
	
	public void additions(boolean lettuce, boolean tomato, boolean carrot, boolean egg) {
		System.out.println("Cannot add additional items");
	}
	
	public void Baseprice() {
		System.out.println(this.baseprice);
	}
	
}
















