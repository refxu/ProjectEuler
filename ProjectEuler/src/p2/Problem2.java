package p2;

public class Problem2 {

	public static void main(String[] args) {

		int num1 = 1;
		int num2 = 2;
		int sum = 0;
		int n3 = 0;

		while (num1 <= 4000000) {

			n3 = num1 + num2;
			num1 = num2;
			num2 = n3;
			if (num1 % 2 == 0) {
				sum += num1;
			}
		}
		System.out.println(sum);
	}

}
