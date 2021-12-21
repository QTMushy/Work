public class Tester {
    public static void main(String[] args) {
        FL ob1 = new FL();
        ob1.addf("shubham");
        ob1.addf("JOhn");
        ob1.addf("guy");
        ob1.addf("shane");
        ob1.addf("hello");


        FL ob2 = ob1.copy();

        ob2.displaylist();

        System.out.println("-----------------------------");


        ob2.delete();

        
        System.out.println("-----------------------------");

        
        ob2.displaylist();

        System.out.println("-----------------------------");
        ob1.displaylist();


    }
    
}
