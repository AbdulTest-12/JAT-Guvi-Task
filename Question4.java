package day9;

import java.util.Scanner;

public class Question4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping with a temp variable
        int temp = a;
        a = b;
        b = temp;

        // After swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
