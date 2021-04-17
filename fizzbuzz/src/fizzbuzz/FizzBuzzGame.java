package fizzbuzz;

class FizzBuzzGame {
	private int number;

	public FizzBuzzGame(int number) {
		super();
		this.number = number;
	}

	void play() {
		for (int i = 1; i <= number; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.print("Fizz");
			} else if (i % 5 == 0) {
				System.out.print("Buzz");
			} else {
				System.out.print(i);
			}
			if (i < number) {
				System.out.print(", ");
			}
		}
	}

}
