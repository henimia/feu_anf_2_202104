package fizzbuzz;

public class FizzBuzzStarter {

	public static void main(String[] args) {
		FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(16);
		fizzBuzzGame.play();

		FizzBuzzGame fizzBuzzGame2 = new FizzBuzzGame(32);
		fizzBuzzGame2.play();
		System.out.println();
		System.out.println("Anzahl gespielter FizzBuzz-Spiele: " + FizzBuzzGame.getGameCounter());
	}

}
