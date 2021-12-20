import java.util.Random;   // Needed for the Random class

/**
   This class simulates rolling a pair of dice 10,000 times
   and counts the number of times doubles of are rolled for
   each different pair of doubles.
*/

public class DiceSimulation
{
   public static void main(String[] args)
   {
      final int NUMBER = 10000;  // Number of dice rolls

      // A random number generator used in
      // simulating the rolling of dice
      Random generator = new Random();

      int die1Value;       // Value of the first die
      int die2Value;       // Value of the second die
      int count = 0;       // Total number of dice rolls
      int snakeEyes = 0;   // Number of snake eyes rolls
      int twos = 0;        // Number of double two rolls
      int threes = 0;      // Number of double three rolls
      int fours = 0;       // Number of double four rolls
      int fives = 0;       // Number of double five rolls
      int sixes = 0;       // Number of double six rolls
      // TASK #1 Enter your code for the algorithm here

      // Display the results
      for(int i=0;i<NUMBER;i++)
      {
         count++;
         die1Value=generator.nextInt(6)+1;
         die2Value=generator.nextInt(6)+1;
         if(die1Value==die2Value)
         {
            if(die1Value==1)
            {
               snakeEyes++;
               System.out.println ("You rolled snake eyes " +
                          snakeEyes + " out of " +
                          count + " rolls.");



            }
            else if(die1Value==2)
            {
               twos++;
               System.out.println ("You rolled double twos " +
                          twos + " out of " + count +
                          " rolls.");



            }
            else if(die1Value==3)
            {
               threes++;
               System.out.println ("You rolled double threes " +
                          threes + " out of " + count +
                          " rolls.");
               


            }
            else if(die1Value==4)
            {
               fours++;
               System.out.println ("You rolled double fours " +
               fours + " out of " + count +
               " rolls.");
               



            }
            else if(die1Value==5)
            {
               fives++;
               System.out.println ("You rolled double fives " +
               fives + " out of " + count +
               " rolls.");
               


            }
           else if(die1Value==6)
            {
               sixes++;
               System.out.println ("You rolled double sixes " +
               sixes + " out of " + count +
               " rolls.");
              
            }
         }
        
      }
      int i=0;
      count=0;
      snakeEyes=0;
      twos=0;
      threes=0;
      fours=0;
      fives=0;
      sixes=0;
      System.out.println("While loop");
      while(i<NUMBER)
      {
         count++;
         i++;
         die1Value=generator.nextInt(6)+1;
         die2Value=generator.nextInt(6)+1;
         if(die1Value==die2Value)
         {
            if(die1Value==1)
            {
               snakeEyes++;
               System.out.println ("You rolled snake eyes " +
                          snakeEyes + " out of " +
                          count + " rolls.");



            }
            else if(die1Value==2)
            {
               twos++;
               System.out.println ("You rolled double twos " +
                          twos + " out of " + count +
                          " rolls.");



            }
            else if(die1Value==3)
            {
               threes++;
               System.out.println ("You rolled double threes " +
                          threes + " out of " + count +
                          " rolls.");
               


            }
            else if(die1Value==4)
            {
               fours++;
               System.out.println ("You rolled double fours " +
               fours + " out of " + count +
               " rolls.");
               



            }
            else if(die1Value==5)
            {
               fives++;
               System.out.println ("You rolled double fives " +
               fives + " out of " + count +
               " rolls.");
               


            }
           else if(die1Value==6)
            {
               sixes++;
               System.out.println ("You rolled double sixes " +
               sixes + " out of " + count +
               " rolls.");
              
            }
         }
        
      }
      i=0;
      count=0;
      snakeEyes=0;
      twos=0;
      threes=0;
      fours=0;
      fives=0;
      sixes=0;
      System.out.println("Do while loop");
      do
      {
         count++;
         i++;
         die1Value=generator.nextInt(6)+1;
         die2Value=generator.nextInt(6)+1;
         if(die1Value==die2Value)
         {
            if(die1Value==1)
            {
               snakeEyes++;
               System.out.println ("You rolled snake eyes " +
                          snakeEyes + " out of " +
                          count + " rolls.");



            }
            else if(die1Value==2)
            {
               twos++;
               System.out.println ("You rolled double twos " +
                          twos + " out of " + count +
                          " rolls.");



            }
            else if(die1Value==3)
            {
               threes++;
               System.out.println ("You rolled double threes " +
                          threes + " out of " + count +
                          " rolls.");
               


            }
            else if(die1Value==4)
            {
               fours++;
               System.out.println ("You rolled double fours " +
               fours + " out of " + count +
               " rolls.");
               



            }
            else if(die1Value==5)
            {
               fives++;
               System.out.println ("You rolled double fives " +
               fives + " out of " + count +
               " rolls.");
               


            }
           else if(die1Value==6)
            {
               sixes++;
               System.out.println ("You rolled double sixes " +
               sixes + " out of " + count +
               " rolls.");
              
            }
         }
        
      }while(i<NUMBER-1);



      
      
   }
}
