public class FinalExam extends GradedActivity {

    private int question;
    private int missed;


    public FinalExam(int noQs, int noMQ) {

        double Score;

        this.question = noQs;
        this.missed = noMQ;

        Score = 100.0 - (noMQ * (100/noQs));

        setMarks(Score);
    }

}