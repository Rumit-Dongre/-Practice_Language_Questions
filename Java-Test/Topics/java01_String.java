package Topics;

public class java01_String {
    public static void main(String[] args) {
        // Ways To create String

        String s = "Hello Rumit";
        System.out.println(s);
        
        // ^ Whenever a String Object is created as a literal, the object will be
        // created in the String constant pool. This allows JVM to optimize the
        // initialization of String literal.

        // ^
        String str = new String("Geeks");
        // ^ The string can also be declared using a new operator i.e. dynamically
        // allocated. In case of String are dynamically allocated they are assigned a
        // new memory location in the heap.

        // ^^
        StringBuffer s1 = new StringBuffer("GeeksforGeeks");

        StringBuilder str1 = new StringBuilder();
        str1.append("GFG");

        // ^^ Immutable String in Java // In Java, string objects are immutable.
        // Immutable simply means unmodifiable or unchangeable. Once a string object is
        // created its data or state can’t be changed but a new string object is
        // created.

        // ^ String Methods
        String myStr = "Hello Rumit";
        String myStr1 = "Hello";
        char result = myStr.charAt(0);
        boolean result1 = myStr1.equals(myStr);
        int result2 = myStr1.length();

    
        System.out.println(myStr.startsWith("H"));
        System.out.println(myStr.length());
        System.out.println(result);

        // Split 

        // String[]  arrs = myStr.split(" ",myStr);
        String str11 = "geekss for geekss rumit hu mai";
        String[] arrOfStr = str11.split(" ");
        System.out.println(arrOfStr);
        for (String s11 : arrOfStr) {
            System.out.println(s11);
            
        }

    }
}
