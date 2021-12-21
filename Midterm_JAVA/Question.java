

public class Question {
    
    String question;
    
    String answerOne;
    String answerTwo; 
    String answerThree; 
    String answerFour; 
    String correctAnswer; 
    
    public Question(String question, String answerOne, String answerTwo,
            String answerThree, String answerFour, String correctAnswer) {
            
        this.question = question;
       
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
        
        this.correctAnswer = correctAnswer;
    }
    
}