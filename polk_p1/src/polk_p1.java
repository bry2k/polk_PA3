import java.security.SecureRandom;
import java.util.Scanner;
public class polk_p1
{
    static Scanner kb;
    static SecureRandom rand;
    static int right, wrong;
    public static void main(String[] args)
    {
        right = 0;
        wrong = 0;
        kb = new Scanner(System.in);
        rand = new SecureRandom();
        System.out.println("What level of difficulty would you like?");
        int difficulty = kb.nextInt();
        System.out.println("What problems would you like? 1 for addition, 2 for multiplication, 3 for subtraction, 4 for division, or 5 for mix.");
        int problemType = kb.nextInt();
        if(problemType == 1)
        {
            for(int i = 0; i < 10; i++)
            {
                askAddQuestion(difficulty);
            }
        }
        else if(problemType == 2)
        {
            for(int i = 0; i < 10; i++)
            {
                askMultQuestion(difficulty);
            }
        }
        else if(problemType == 3)
        {
            for(int i = 0; i < 10; i++)
            {
                askSubQuestion(difficulty);
            }
        }
        else if(problemType == 4)
        {
            for(int i = 0; i < 10; i++)
            {
                askDivQuestion(difficulty);
            }
        }
        else if(problemType == 5)
        {
            for(int i = 0; i < 10; i++)
            {
                askQuestion(difficulty);
            }
        }
        else
        {
            for(int i = 0; i < 10; i++)
            {
                askQuestion(difficulty);
            }
        }
        if((double)(right)/(double)(wrong) > 0.75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
    public static void askQuestion(int difficulty)
    {
        int randType = rand.nextInt(4);
        if(randType == 0)
        {
            askAddQuestion(difficulty);
        }
        else if(randType == 1)
        {
            askMultQuestion(difficulty);
        }
        else if(randType == 2)
        {
            askSubQuestion(difficulty);
        }
        else if(randType == 3)
        {
            askDivQuestion(difficulty);
        }
    }
    public static void askSubQuestion(int difficulty)
    {
        if(difficulty > 4)
        {
            difficulty = 4;
        }
        if(difficulty < 1)
        {
            difficulty = 1;
        }
        int num1 = 0, num2 = 0;

        if(difficulty == 1)
        {
            num1 = rand.nextInt(9) + 1;
            num2 = rand.nextInt(9) + 1;
        }
        else if(difficulty == 2)
        {
            num1 = rand.nextInt(99) + 1;
            num2 = rand.nextInt(99) + 1;
        }
        else if(difficulty == 3)
        {
            num1 = rand.nextInt(999) + 1;
            num2 = rand.nextInt(999) + 1;
        }
        else if(difficulty == 4)
        {
            num1 = rand.nextInt(9999) + 1;
            num2 = rand.nextInt(9999) + 1;
        }
        System.out.printf("How much is %d minus %d?\n", num1, num2);
        int answer = kb.nextInt();
        if(answer == num1 - num2)
        {
            goodAnswer();
            right++;
        }
        else
        {
            badAnswer();
            wrong++;
        }
    }
    public static void askAddQuestion(int difficulty)
    {
        if(difficulty > 4)
        {
            difficulty = 4;
        }
        if(difficulty < 1)
        {
            difficulty = 1;
        }
        int num1 = 0, num2 = 0;

        if(difficulty == 1)
        {
            num1 = rand.nextInt(9) + 1;
            num2 = rand.nextInt(9) + 1;
        }
        else if(difficulty == 2)
        {
            num1 = rand.nextInt(99) + 1;
            num2 = rand.nextInt(99) + 1;
        }
        else if(difficulty == 3)
        {
            num1 = rand.nextInt(999) + 1;
            num2 = rand.nextInt(999) + 1;
        }
        else if(difficulty == 4)
        {
            num1 = rand.nextInt(9999) + 1;
            num2 = rand.nextInt(9999) + 1;
        }
        System.out.printf("How much is %d plus %d?\n", num1, num2);
        int answer = kb.nextInt();
        if(answer == num1 + num2)
        {
            goodAnswer();
            right++;
        }
        else
        {
            badAnswer();
            wrong++;
        }
    }
    public static void askDivQuestion(int difficulty)
    {
        if(difficulty > 4)
        {
            difficulty = 4;
        }
        if(difficulty < 1)
        {
            difficulty = 1;
        }
        int num1 = 0, num2 = 0;

        if(difficulty == 1)
        {
            num1 = rand.nextInt(9) + 1;
            num2 = rand.nextInt(9) + 1;
        }
        else if(difficulty == 2)
        {
            num1 = rand.nextInt(99) + 1;
            num2 = rand.nextInt(99) + 1;
        }
        else if(difficulty == 3)
        {
            num1 = rand.nextInt(999) + 1;
            num2 = rand.nextInt(999) + 1;
        }
        else if(difficulty == 4)
        {
            num1 = rand.nextInt(9999) + 1;
            num2 = rand.nextInt(9999) + 1;
        }
        System.out.printf("How much is %d divided by %d?\n", num1, num2);
        double answer = kb.nextDouble();
        if(Math.abs(((double)num1/(double)num2) - answer) < 0.01)
        {
            goodAnswer();
            right++;
        }
        else
        {
            badAnswer();
            wrong++;
        }
    }
    public static void askMultQuestion(int difficulty)
    {
        if(difficulty > 4)
        {
            difficulty = 4;
        }
        if(difficulty < 1)
        {
            difficulty = 1;
        }
        int num1 = 0, num2 = 0;

        if(difficulty == 1)
        {
            num1 = rand.nextInt(9) + 1;
            num2 = rand.nextInt(9) + 1;
        }
        else if(difficulty == 2)
        {
            num1 = rand.nextInt(99) + 1;
            num2 = rand.nextInt(99) + 1;
        }
        else if(difficulty == 3)
        {
            num1 = rand.nextInt(999) + 1;
            num2 = rand.nextInt(999) + 1;
        }
        else if(difficulty == 4)
        {
            num1 = rand.nextInt(9999) + 1;
            num2 = rand.nextInt(9999) + 1;
        }
        System.out.printf("How much is %d times %d?\n", num1, num2);
        int answer = kb.nextInt();
        if(answer == num1 * num2)
        {
            goodAnswer();
            right++;
        }
        else
        {
            badAnswer();
            wrong++;
        }
    }

    public static void goodAnswer()
    {
        int response = rand.nextInt(4);
        switch(response)
        {
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Excellent!");
                break;
            case 2:
                System.out.println("Nice work!");
                break;
            case 3:
                System.out.println("Keep up the good work!");
                break;
        }
    }
    public static void badAnswer()
    {
        int response = rand.nextInt(4);
        switch(response)
        {
            case 0:
                System.out.println("No. Please try again.");
                break;
            case 1:
                System.out.println("Wrong. Try once more.");
                break;
            case 2:
                System.out.println("Don't give up!");
                break;
            case 3:
                System.out.println("No. Keep trying.");
                break;
        }
    }

}