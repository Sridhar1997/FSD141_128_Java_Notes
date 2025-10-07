// Read and Display a Name
// Read an Integer and Check Even or Odd
// Read Two Numbers and Fine the Largest

import java.util.Scanner;

class Day7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Largest : "+ (a>b?a:b));
        System.out.println(a>b ? "A is Biggest Value" : "B is Biggest Value");

        // System.out.print("Enter a Number : ");
        // int num = sc.nextInt();
        // System.out.println(num % 2 == 0 ? "Even Number" : "Odd Number");

        // System.out.print("Enter your Name : ");
        // String name = sc.nextLine();
        // System.out.println("Welcome " + name);
    }
}
