import java.util.Scanner;

public class Recursion {

    // Function calling itself is called as recursion
    static int factorial(int n){ // This is a recursive function
        if( n ==1 || n == 0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    static int fact_iterative(int n){  // Traditional Iterative approach
        if( n == 0 || n == 1 ){
            return 1;
        } else {
            int product =1;
            for (int i = 1; i <=n ; i++) {
                product *= i;
            }
            return product;
        }
    }

    static int fibonacci(int n){
        if( n == 0){
            return 0;
        } else if ( n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------------");
        System.out.println("Enter the number between (0-16): ");
        int n;
        while (true){
            n = sc.nextInt();
            if( n >= 0 && n <= 16){
                break;
            }
            System.out.println("Number out of range!!. \n Re-Enter Valid number: ");
        }
        System.out.println("---------------------------------------------------------");
        System.out.println("---------Factorial----------");
        System.out.println("THe value of "+n+"! is: "+factorial(n));
        System.out.println("Iterative Factorial of "+n+"! is: " + fact_iterative(n));
        System.out.println("---------------------------------------------------------");
        System.out.println("---------Fibonacci series----------");
        System.out.println("The fibonacci series of "+n+" is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println("---------------------------------------------------------");
    }
}
