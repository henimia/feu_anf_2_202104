package fizzbuzz;

class FizzBuzzGame {
	private static final int BUZZ_NUMBER = 5;
	private static final int FIZZ_NUMBER = 3;
	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";
	private static final String FIZZ_BUZZ = FIZZ + BUZZ;

	private static int gameCounter;

	private int endNumber;

	public FizzBuzzGame(int number) {
		super();
		FizzBuzzGame.gameCounter++;
		this.endNumber = number;
	}

	void play() {
		for (int i = 1; i <= endNumber; i++) {
			doFizzBuzzForSingleNumber(i);
			if (i < endNumber) {
				System.out.print(", ");
			}
		}
	}

	private static void doFizzBuzzForSingleNumber(int number) {
		if (isFizzBuzz(number)) {
			System.out.print(FIZZ_BUZZ);
		} else if (isFizz(number)) {
			System.out.print(FIZZ);
		} else if (isBuzz(number)) {
			System.out.print(BUZZ);
		} else {
			System.out.print(number);
		}
	}

	private static boolean isBuzz(int number) {
		return number % BUZZ_NUMBER == 0;
	}

	private static boolean isFizz(int number) {
		return number % FIZZ_NUMBER == 0;
	}

	private static boolean isFizzBuzz(int number) {
		return isFizz(number) && isBuzz(number);
	}

	public static int getGameCounter() {
		return gameCounter;
	}

}
