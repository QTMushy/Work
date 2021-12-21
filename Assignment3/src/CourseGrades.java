public class CourseGrades implements Analyzable{


    private GradedActivity[] grades = new GradedActivity[4];

    public CourseGrades(){
        grades = new GradedActivity[4];
    }

    public void setLab(GradedActivity g1){
        grades[0] = g1;
    }

    public void setPassFailExam(PassFailExam pf1){
        grades[1] = pf1;
    }

    public void setEssay(GradedActivity g2){
        grades[2] = g2;
    }

    public void setFinalExam(FinalExam f1){
        grades[3] = f1;
    }

    public GradedActivity[] getGrades() {
        return grades;
    }

    @Override
    public double getAverage() {
        double sum = 0.0;
        double mean = 0.0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i].getMarks();
        }
        mean = sum / 4;
        return mean;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity h = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getMarks() > h.getMarks()) {
                h = grades[i];
            }
        }
        return h;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity l = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i].getMarks() <l.getMarks()) {
                l = grades[i];
            }
        }
        return l;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return  "Lab Score: " + grades[0].getMarks() + "\t" + "Grade: " + grades[0].getGrade() + "\n" +
                "Pass/Fail Exam Score: " + grades[1].getMarks() + " " + "Grade: " + grades[1].getPassFail() + "\n"
                + "Essay Score: " + grades[2].getMarks() + " " + "Grade: " + grades[2].getGrade()
                + "\n" + "Final Exam Score: " + grades[3].getMarks() + "\t" + "Grade: " + grades[3].getGrade();

    }

}