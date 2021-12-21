public class PassFailExam extends GradedActivity {

    private int questions;
    private int points;
    private int missed;


    public PassFailExam(int totalQ, int totalM, double mPass) {

        this.questions = totalQ;
        this.points = 100/totalQ;
        this.missed = totalM;

        double s = 100.0 - (totalM * points);
        setMarks(s);
    }


}