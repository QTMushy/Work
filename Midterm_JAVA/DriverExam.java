public class DriverExam {
    private char[] correct_answer = {'B','D','A','A','C','A','B','A','C','D'};
    private char[] input_answer = new char[10];
    private int correct = 0;
    private int wrong = 0;
    private int[] question_missed = new int[10];
    private int count = 0;
    private int miss = 0;
    public void get_answers(char answer)
    {

      
            this.input_answer[count]=Character.toUpperCase(answer);
            count++;
        
       
    }
    public void check()
    {
        for(int i = 0;i<input_answer.length;i++)
        {
            
            
                
              if(input_answer[i]==correct_answer[i])
                {
                    correct++;
                }
                else
                {
                    question_missed[miss]=i+1;
                    miss++;
                    wrong++;
                }
            
        }
    }
    public boolean passed()
    {
        if(correct>=7)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int total_correct()
    {
        return this.correct;
    }
    public int total_incorrect()
    {
        return this.wrong;
    }
    public void show_result()
    {
        if(passed())
        {
           
            System.out.println("Correct answers: "+ total_correct());
            System.out.println("Incorrect answers: "+total_incorrect());
            System.out.println("Congrats you passed!");
        }
        else
        {
           
            System.out.println("Correct answers: "+ total_correct());
            System.out.println("Incorrect answers: "+total_incorrect());
            System.out.println("Sorry you Failed");
            
            
            
        }
        System.out.println("You missed the following questions");
        for(int v:question_missed)
            {
                if(v!=0)
                    System.out.printf("%d ",v);
                else
                    continue;
            }
        
    }



    
}
