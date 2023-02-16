import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the no of Rounds");
        int n = sc.nextInt();
        int person1,count =0;
        int p1 = 0, p2 =0;
        System.out.println("Best of "+n+" Wins!!\nAll the Best.....");
        while(count<n){
            System.out.println("-----------------------------------");
            System.out.println("Round "+ count+1);
            System.out.println("-----------------------------------");
            System.out.println("Enter your choice\n 0 -> for rock\n 1-> for paper \n 2 -> for scissor");
            while (true){
                person1 = sc.nextInt();
                if( person1 >= 0 && person1 <= 2){
                    break;
                }
                System.out.println("Invalid choice!!. \n Enter your choice: ");
            }

            int computer = random.nextInt(3);
            System.out.println(computer);
            switch (person1) {
                case 0 -> {
                    if (computer == 0)
                        System.out.println("Draw");
                    else if (computer == 1) {
                        System.out.println(" person 2 wins ");
                        p2++;
                    } else {
                        System.out.println(" person 1 wins ");
                        p1++;
                    }
                }
                case 1 -> {
                    if (computer == 1)
                        System.out.println("Draw");
                    else if (computer == 2) {
                        System.out.println(" person 2 wins ");
                        p2++;
                    } else {
                        System.out.println(" person 1 wins ");
                        p1++;
                    }
                }
                case 2 -> {
                    if (computer == 2)
                        System.out.println("Draw");
                    else if (computer == 1) {
                        System.out.println(" person 1 wins ");
                        p1++;
                    } else {
                        System.out.println(" person 2 wins ");
                        p2++;
                    }
                }
            }
            count++;
        }
        System.out.println("Overall Winner is :");
        if(p1>p2)
            System.out.println("Person 1");
        else
            System.out.println("Computer");
    }
}
