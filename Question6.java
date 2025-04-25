package day9;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3; 
        long factorial = 2;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }

}
