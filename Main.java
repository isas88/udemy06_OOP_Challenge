package udemy06_OOP_Challenge;

public class Main {


	public static void main(String[] args) {
	
		Baseham baseham1 = new Baseham("Italian Herb","Pork",4);
		Healthyham healthyham1 = new Healthyham("No Meat",5);
		Deluxeham deluxeham1 = new Deluxeham("Plain Bread","Chicken", 7,true,true);
		
		baseham1.additions(true, false, true, true);
		baseham1.Baseprice();
		baseham1.printtotal();
		
		System.out.println("***********End of Base Ham Burger******************");
		
		healthyham1.additions(true, true, false, true, false, true);
		healthyham1.Baseprice();
		healthyham1.printtotal();
		
		System.out.println("***********End of Healthy Ham Burger******************");
		
		deluxeham1.additions(true, true, true, true);
		deluxeham1.Baseprice();
		deluxeham1.printtotal();
		
		System.out.println("***********End of Deluxe Ham Burger******************");
	}

}
