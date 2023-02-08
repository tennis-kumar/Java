import java.util.Scanner;

public class User_inputs {

    public static void main(String[] args) {
        System.out.println("Taking input from the user");

        Scanner sc = new Scanner(System.in); // Read input from the keyboard
        //example
        System.out.println("Enter the first number: ");
        int a = sc.nextInt(); // will capture inp from keyboard and store it in a
        System.out.println("Enter the second number: ");
        int b = sc.nextInt(); // nextInt() is used to capture integer data
        int sum = a+b;
        System.out.println("The sum of number 1 and number 2 is: "+ sum);

        boolean bol = sc.hasNextInt(); // captures input and checks if it is an integer value or not, will return a boolean value true or false
        System.out.println(bol);

        String str = sc.next(); // reads only a single word
        System.out.println(str);
        String str1 = sc.nextLine(); // reads a complete line
        System.out.println(str1);
    }

}
