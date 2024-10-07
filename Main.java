import java.util.Scanner;

public class Main {

    public static void main(String []args) {
    
    
    Question q = new Question();
    Scanner input = new Scanner(System.in);

    System.out.println("Are you ready? ");
    String a = input.nextLine();
    
    if (a.equals("no"))
    {
        System.out.println("then GET OUT!!!");
        System.exit(0);
    }
    else
    {
        System.out.println("Okay Question 1: ");
    }
    
    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String x = input.nextLine();
    
    System.out.println(q.answer(x));
    }

}