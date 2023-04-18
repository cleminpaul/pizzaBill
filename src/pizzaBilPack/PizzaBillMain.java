package pizzaBilPack;

import java.util.Scanner;

public class PizzaBillMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cr = new Scanner(System.in);
		PizzaBillClass pizaa = new PizzaBillClass();
		pizaa.pizza();
		pizaa.addcheesePizza();
		pizaa.finalbill();
	}

}
