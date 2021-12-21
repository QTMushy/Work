public class WorkerDemo {
    public static void main(String[] args) {
        ProductionWorker pw1 = new ProductionWorker("John Smith","123-A","11-15-2005",1,16.5);
        ProductionWorker pw2 = new ProductionWorker("Joan Jones","222-L","12-12-2005",2,18.50);


        System.out.println("Here's the first production worker.\n"+pw1);
        System.out.println("Here's the second production worker.\n"+pw2);
    }
}
