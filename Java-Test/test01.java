import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {

        // @ 9 Write a Java program that takes three numbers as input to calculate and
        // print the average of the numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2 :");
        int num2 = sc.nextInt();

        System.out.println("Enter Number 3 :");
        int num3 = sc.nextInt();

        float average = num1 + num2 + num3 / 3;
        System.out.println("Average is : " + average);


        //@ 10 Write a Java program to swap two variables

        int a = 10;
        int b = 20;
        int c;

        // c = a;
        // a = b;
        // b = c;

        a = a + b; // 30
        b = a -b; // 30 - 20 = b 
        a = a -b; // 30 - 10

        System.out.println(a);
        System.out.println(b);









    }

}
