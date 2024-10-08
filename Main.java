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

    String ans1 = input.nextLine();
    
    System.out.println(q.answer(ans1));

    
    System.out.println("QUESTION 2!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans2 = input.nextLine();
    
    System.out.println(q.answer(ans2));


    System.out.println("QUESTION 3!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans3 = input.nextLine();
    
    System.out.println(q.answer(ans3));

    
    
    System.out.println("QUESTION 4!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans4 = input.nextLine();
    
    System.out.println(q.answer(ans4));


    System.out.println("QUESTION 5!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans5 = input.nextLine();
    
    System.out.println(q.answer(ans5));


    System.out.println("QUESTION 6!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans6 = input.nextLine();
    
    System.out.println(q.answer(ans6));


    System.out.println("QUESTION 7!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans7 = input.nextLine();
    
    System.out.println(q.answer(ans7));


    System.out.println("QUESTION 8!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans8 = input.nextLine();
    
    System.out.println(q.answer(ans8));


    System.out.println("QUESTION 9!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans9 = input.nextLine();
    
    System.out.println(q.answer(ans9));


    System.out.println("QUESTION 10!");

    System.out.println(q.quest("What is mu favoorite c olro??", "CYAN"));

    String ans10 = input.nextLine();
    
    System.out.println(q.answer(ans10));
    
    input.close();
    }

}