package day9;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 90845;
	        int count = 0;

	        if (number == 0) {
	            count = 1;
	        } else {
	            while (number != 0) {
	                number = number / 10;
	                count++;
	            }
	        }

	        System.out.println("Number of digits: " + count);
	    }

}
