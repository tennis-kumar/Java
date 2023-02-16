import java.util.Scanner;

public class PractiseLoops {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------------------");
        int num= 4;

        for( int i =num;i>0;i--) {
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------------------");
        // Practise problem 2
        //Q. Sum first n even numbers
        int sum=0;
        int n=5;
        //First 5 Even numbers are - 0 2 4 6 8
        for( int i=0;i<n;i++) sum += (2 * i);
        System.out.print("The sum of First "+n+" Even numbers is:");
        System.out.print(sum+"\n");
        System.out.println("---------------------------------------------------------------------------------");

        // Practise problem 3
        // Print multiplication table of given number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int multi = sc.nextInt();
        int k = 1;
        System.out.println("The multiplication Table is:");
        while(k<=10){
            System.out.println(multi+" * "+k+" = "+multi*k);
            k++;
        }
        System.out.println("---------------------------------------------------------------------------------");
        //Problem 4
        // Multiplication table in reverse order
        System.out.println("The Multiplication Table in reverse order is:");
        int l=10;
        while(l>0){
            System.out.println(multi+" * "+l+" = "+multi*l);
            l--;
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("The factorial of "+multi+" is: ");
        int m=1;
        int factorial =1;
        while (m<=multi){
            factorial *=m;
            m++;
        }
        System.out.println("Factorial of "+multi+" is: "+factorial);

    }
}
