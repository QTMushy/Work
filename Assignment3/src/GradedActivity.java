public class GradedActivity {

    private double marks;
    private double minimum;



    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public double getMarks() {
        return this.marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public char getGrade(){
        if(marks >= 90){
            return 'A';
        }else if(marks >= 80){
            return 'B';
        }else if(marks >= 70){
            return 'C';
        }else if(marks >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }

    public char getPassFail(){
        if(marks >= minimum){
            return 'P';
        }else{
            return 'F';
        }
    }








}