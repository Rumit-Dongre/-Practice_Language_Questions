import java.util.Scanner;

class day01 {
    public static void main(String[] args) {

        // @ 1.Write a Java program to print 'Hello' on screen and then print your name
        // on a separate line.

        System.out.println("Hello");
        System.out.println("Rumit");

        // @ 2 Write a Java program to print the sum of two numbers
        int num1 = 10;
        int num2 = 10;
        System.out.println(num1 + num2);

        // @ 3 Write a Java program to divide two numbers and print on the screen

        int num3 = 50;
        int num4 = 15;
        System.out.println(num3 / num4);

        System.out.println("\n");
        // @ 4 Write a Java program to print the result of the following operations
        // ^ a. -5 + 8 * 6
        // ^ b. (55+9) % 9
        // ^ c. 20 + -3*5 / 8
        // ^ d. 5 + 15 / 3 * 2 - 8 % 3

        int a = -5 + 8 * 6;
        System.out.println(a);
        int a1 = (55 + 9) % 9;
        System.out.println(a1);

        int a2 = 20 + -3 * 5 / 8;
        System.out.println(a2);

        int a3 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(a3);

        // @ 5 Write a Java program that takes two numbers as input and display the
        // product of two numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number 1: ");
        int numb1 = sc.nextInt();
        System.out.println("Enter The Number 2: ");
        int numb2 = sc.nextInt();
        System.out.println("Produuct Of Two Number is = " + " " + numb1 * numb2);

        // @ 6 Write a Java program to print the sum (addition), multiply, subtract,
        // divide and remainder of two numbers

        int b = 125 + 24;
        int b1 = 125 - 24;
        int b2 = 125 * 24;
        int b3 = 125 / 24;
        int b4 = 125 % 24;
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        // @ 7 Write a Java program that takes a number as input and prints its
        // multiplication table upto 10

        System.out.println("Enter The Number For Table : ");

        int table1 = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(table1 + " x " + i + " = " + table1 * i);

        }

        // @ 8 Write a Java program to print the area and perimeter of a circle where
        // Radius = 7.5

        double r = 7.5;

        double areaOfCircle = 3.14 * r * r;
        System.out.println(areaOfCircle);

        double perimeterOfCircle = 2 * 3.14 * r;
        System.out.println(perimeterOfCircle);

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

        // @ 10 Write a Java program to swap two variables

        int a22 = 10;
        int b22 = 20;
        int c22;

        // c22 = a;
        // a22 = b;
        // b22 = c;

        a 22= a22 + b22; // 30
        b22 = a22 - b; // 30 - 20 = b
        a22 = a22 - b22; // 30 - 10

        System.out.println(a22);
        System.out.println(b22);

    }
}