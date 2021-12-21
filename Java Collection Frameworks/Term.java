public class Term {

    private int power;
    private int coefficent;

    public Term(int power,int coefficent)
    {
        this.power = power;
        this.coefficent = coefficent;

    }

    public int getCoefficent() {
        return coefficent;
    }
    public int getPower() {
        return power;
    }
    public void setCoefficent(int coefficent) {
        this.coefficent = coefficent;
    }
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return ""+this.coefficent+"x^"+this.power;
    }
}
