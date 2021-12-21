public class CourseGradesAnalyzableDemo {

    public static void main(String[] args) {
        GradedActivity g1 = new GradedActivity();
        g1.setMarks(85);

        PassFailExam p1 = new PassFailExam(100, 3, 70);

        GradedActivity g2 = new GradedActivity();
        g2.setMarks(20);

        FinalExam f1 = new FinalExam(50, 20);

        CourseGrades cg1 = new CourseGrades();

        cg1.setLab(g1);
        cg1.setPassFailExam(p1);
        cg1.setEssay(g2);
        cg1.setFinalExam(f1);

        System.out.println(cg1);

        System.out.println("Average Score: " + cg1.getAverage());
        System.out.println("Highest Score: " + cg1.getHighest().getMarks());
        System.out.println("Lowest Score: " + cg1.getLowest().getMarks());
    }
}
