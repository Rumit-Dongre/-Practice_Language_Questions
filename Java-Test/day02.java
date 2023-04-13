
public class day02 {

    static int characters;
    static int spaces;

    public static void main(String[] args) {
        System.out.println("Hello World");

        // @ 11 Write a Java program to check whether Java is installed on your
        // computer.

        // ^ Open Terminal and Type java --version

        // @ 12 Write a Java program to compare two numbers
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter The Number 1 ");
        // int num1 = sc.nextInt();
        // System.out.println("Enter The Number 2");
        // int num2 = sc.nextInt();

        // if (num1 > num2) {
        // System.out.println("Number 1 " + " " + num1 + " is Greater than " + " " +
        // num2);

        // } else {
        // System.out.println("Number 2 " + " " + num2 + " is Greater than " + " " +
        // num1);

        // }

        // @ 13 Add Two Binary Numbers

        // byte n1 = 0b11;
        // byte n2 = 0b11111;
        // System.out.println(n1);
        // System.out.println(n2);
        // System.out.println(n2 + n1);

        // @ 14 Write a Java program to reverse a string

        String para = "The quick brown fox Expected Output";

        // StringBuilder input1 = new StringBuilder();

        // input1.append(para);
        // input1.reverse();
        // System.out.println(input1);

        // ! converting string into array for iterate

        // char[] chars = para.toCharArray();

        // System.out.println(chars.length);

        // for (int i = chars.length - 1 ; i >= 0; i--) {
        // System.out.println(chars[i]);

        // }

        // @ 15 Write a Java program to count the letters, spaces characters of an input
        // string

        // String para1 = "The quick brown fox Expected Output";
        // char[] parArr = para1.toCharArray();

        // System.out.println(parArr.length);
        // for (char c : parArr) {
        // // if (c == ' ') {
        // // spaces = spaces + 1;

        // // }
        // if(Character.isSpaceChar(c)){
        // spaces ++ ;
        // }

        // else if (Character.isLetter(c)) {
        // characters = characters + 1;
        // }

        // }
        // System.out.println(characters);
        // System.out.println(spaces);

        // ^^

        // @ 16 Write a Java program to create and display unique three-digit number
        // using 1, 2, 3, 4. Also count how many three-digit numbers are there.

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {

                    if (i != j && i != k && k != j) {
                        System.out.println(i + " " + j + " " + k);

                    }

                }

            }
        }

    }
}