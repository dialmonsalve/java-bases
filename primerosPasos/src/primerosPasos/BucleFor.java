package primerosPasos;

public class BucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++) {

			int num = i + 1;
			if ((num % 15) == 0) {
				System.out.println((i + 1) + " - FizzBuzz");
			} else if ((num % 5) == 0) {
				System.out.println((i + 1) + " - Buzz");
			} else if ((num % 3) == 0) {
				System.out.println((i + 1) + " - Fizz");
			} else {
				System.out.println((i + 1));
			}

		}
	}

}
