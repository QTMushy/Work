
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;



public class TriviaGame {
    public static void main(String[] args)
    throws IOException
    {
        ArrayList<Question> questions = new ArrayList<>();
        Player player1 = new Player();
        Player player2 = new Player();
        String user_answer;
        Scanner keyboard = new Scanner(System.in);
        FileReader file = new FileReader("trivia.txt");
        Scanner scan = new Scanner(file);
        
        while(scan.hasNextLine())
        {
            questions.add(new Question(scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine(),scan.nextLine()));

        }
        file.close();
        scan.close();

        for(int i=0;i<questions.size();i++)
        {
            if(i%2==0)
            {
                System.out.println("Question for player #1");
                System.out.println("-------------------------");
                System.out.println(questions.get(i).question);
                System.out.println("1 "+questions.get(i).answerOne);
                System.out.println("2 "+questions.get(i).answerTwo);
                System.out.println("3 "+questions.get(i).answerThree);
                System.out.println("4 "+questions.get(i).answerFour);
                System.out.println("Enter the number of correct answer: ");
                user_answer = keyboard.nextLine();
                if(user_answer.compareToIgnoreCase(questions.get(i).correctAnswer)==0)
                {
                    System.out.println("Correct!");
                    player1.point_update();

                }
                else
                {
                    System.out.printf("Sorry, that is incorrect. The correct answer is %s\n",questions.get(i).correctAnswer);
                }

            }
            else
            {
                
                System.out.println("Question for player #2");
                System.out.println("-------------------------");
                System.out.println(questions.get(i).question);
                System.out.println("1 "+questions.get(i).answerOne);
                System.out.println("2 "+questions.get(i).answerTwo);
                System.out.println("3 "+questions.get(i).answerThree);
                System.out.println("4 "+questions.get(i).answerFour);
                System.out.println("Enter the number of correct answer: ");
                user_answer = keyboard.nextLine();
                if(user_answer.compareToIgnoreCase(questions.get(i).correctAnswer)==0)
                {
                    System.out.println("Correct!");
                    player2.point_update();

                }
                else
                {
                    System.out.printf("Sorry, that is incorrect. The correct answer is %s\n",questions.get(i).correctAnswer);
                }

            }

        }
        System.out.println("Game Over!");
        System.out.println("---------------");
        System.out.println("Player 1's points: "+player1.get_point());
        System.out.println("Player 2's points: "+player2.get_point());
        if(player1.get_point() > player2.get_point()) {
            System.out.print("Player one wins!");
        } else {
            System.out.print("Player two wins!");
        }
        keyboard.close();



        
    }
    
}
