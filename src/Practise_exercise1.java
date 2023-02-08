import java.util.Scanner;

public class Practise_exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of Subject 1:");
        int m1 = sc.nextInt();
        System.out.println("Enter the marks of Subject 2:");
        int m2 = sc.nextInt();
        System.out.println("Enter the marks of Subject 3:");
        int m3 = sc.nextInt();
        System.out.println("Enter the marks of Subject 4:");
        int m4 = sc.nextInt();
        System.out.println("Enter the marks of Subject 5:");
        int m5 = sc.nextInt();

        int total_marks = m1+m2+m3+m4+m5;
        float percentage = (total_marks/500.0f)*100;
        System.out.println(percentage);

    }
}
