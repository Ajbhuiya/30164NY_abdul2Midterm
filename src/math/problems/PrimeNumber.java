package math.problems;

public class PrimeNumber {

	public static boolean primenumber (int num) {
		int count = 0;//counting how many dividers
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;

			}
		}
		if (count != 2) {
			return false;
		} else
			return true;
	}


	public static void main(String [] args) {


		for (int i=2; i<100; i++){
			if(PrimeNumber.primenumber(i)){
				System.out.println(i+"");
			}
		}



	}

}

