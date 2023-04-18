package pizzaBilPack;

import java.util.Scanner;

public class PizzaBillClass {
	int small,medium,large;
	String size;
	int addPepper;
	int cheese;
	int pizzaSize;
	boolean peper;
	boolean isPepperoniNeeded = true;
	boolean addcheese = false;
	Scanner sc = new Scanner(System.in);
	
	
	void pizza() {
		System.out.println("what kind of cheese pizza do you want");
		size= sc.next();
		switch (size) {	
		case "small":{
			System.out.println("you are selected small size pizza");
			pizzaSize=15;
			System.out.println("for additional pepperoni need: true/false");
			peper=sc.nextBoolean();
			if(isPepperoniNeeded) {
				addPepper=2;
				System.out.println("pepperoni added for the small pizza");
				return;
			}
			else {
				System.out.println("no need to addon pepperoni");
			}
			break;
		}
		case "medium":{
			System.out.println("you are selected medium size pizza");
			pizzaSize=20;
			System.out.println("for additional pepperoni need: true/false");
			 peper=sc.nextBoolean();
			if(isPepperoniNeeded) {
				addPepper=3;
				System.out.println("pepperoni added for the medium pizza");
				return;
					}
			else {
				System.out.println("no need to addon pepperonni");
			}
			break;
		}
		case "large":{
			System.out.println("you are selected large size pizza");
			pizzaSize=25;
			System.out.println("for additional pepperoni need: true/false");
			peper=sc.nextBoolean();
			if(isPepperoniNeeded) {
				addPepper=3;
				System.out.println("pepperoni added for the large pizza");
				
			}
			else {
				System.out.println("no need to addon pepperoni");
				return;
			}
			break;
		}
	
		default:
			System.out.println("INVALID SELECTION");
			break;
		}
		
}
	void addcheesePizza() {
		
		if(addcheese=true) {
			System.out.println("for additional cheese need true/false");
			sc.next();cheese=1;
			System.out.println("cheese added");
		}
		
		
		
	}
	void finalbill() {
		System.out.println("total pirze for pizaa :");
		System.out.println(pizzaSize+addPepper+cheese);
	}
}
