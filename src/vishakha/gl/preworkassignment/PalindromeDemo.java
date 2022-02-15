package vishakha.gl.preworkassignment;

import java.util.Scanner;

public class PalindromeDemo {
static int number, n, rev, remainder;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:: ");
		number = sc.nextInt();
		n = number;
		for(rev=0;number>0;number/=10) {
			remainder = number%10;
			rev = (rev*10) + remainder;
		}
		if(rev == n) {
			System.out.println("The given number is Palindrome.");
		}else
			System.out.println("Number is not palindrome.");
		

	}

}
