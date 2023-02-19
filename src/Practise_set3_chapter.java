import java.util.Scanner;

public class Practise_set3_chapter {

    static void multi(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.format("%d x %d = %d\n", n,i,n*i);
        }
    }
    static void printStar(int n){
        for( int i = 0; i<n; i++) {
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printStarD(int n){
        for( int i = n; i>0; i--) {
            for(int j = i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum_natural(int n){
        if ( n == 1) return 1;
        return n + sum_natural(n-1);
    }

    static int fib(int n){
//        if ( n == 1){
//            return 0;
//        } else if (n == 2) {
//            return 1;
        if ( n == 1 || n == 2){
            return n-1;
        } else {
            return fib(n-1)+fib(n-2);
        }
    }

    static double average(double ...arr){
        double sum =0;
        for (double num:arr) {
            sum +=num;
        }
        return sum/ (arr.length);
    }


    public static void main(String[] args) {
        // Problem 1
        // Java method to print multiplication table of a number
        System.out.println("------------------------------------------------------------");
        System.out.println("------------------ Multiplication Table --------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        multi(n);
        System.out.println("------------------------------------------------------------");
        // Problem 2 -> print the following pattern using methods
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("------------------ * Pattern Printing-----------------------");
        System.out.println("Enter the no.of stars to print: ");
        int star = sc.nextInt();
        printStar(star);
        System.out.println("------------------------------------------------------------");

        // Problem 3 -> Calculate the sum of first 'n' natural numbers
        System.out.println("------------------ sum of n natural numbers ----------------");
        System.out.println("Enter the value of n: ");
        int n1 = sc.nextInt();

        System.out.println("The sum is: "+sum_natural(n1));
        System.out.println("------------------------------------------------------------");

        // Problem 4 -> Print the following pattern
        // *****
        // ****
        // ***
        // **
        // *
        System.out.println("------------------ * Pattern Printing-----------------------");
        System.out.println("Enter the no.of stars to print: ");
        int starD = sc.nextInt();
        printStarD(starD);
        System.out.println("------------------------------------------------------------");

        // Problem 5 Print "n-th" term of a fibonacci series
        // fibonacci series -> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        System.out.println("-------------- n-th term in Fibonacci series ---------------");
        System.out.println("Enter the value of n: ");
        int n2 = sc.nextInt();
        int result = fib(n2);
        System.out.println("The n-th term in the fibonacci series is: "+result);
        System.out.println("------------------------------------------------------------");

        // Problem 6 FInd average of set of numbers passed as arguments
        System.out.println("---------------- average of set of numbers -----------------");
        double res = average(5,6,7,8,9,10);
        System.out.println("The average is: "+res);
        System.out.println("------------------------------------------------------------");
    }
}
