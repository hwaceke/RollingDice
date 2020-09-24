package myPortfolio2020;

import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		Random rollIt = new Random();
		int number = rollIt.nextInt(6) + 1;
		System.out.println("You rolled: " + number);

	}

}
