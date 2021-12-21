public class Temperature {
    private double ftemp;

    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    public double getFahrenheit() {
        return ftemp;
    }
    public double getCelsius(){
        double temp = ((5)*(this.ftemp-32))/9;
        return temp;
    }
    public double getKelvin(){
        return  ((5)*(this.ftemp-32))/9+273;
    }
    public void show_results(){
        System.out.printf("Celsius:%,.2f\n ",getCelsius());
        System.out.printf("Kelvin:%,.2f\n",getKelvin());
    }
}
