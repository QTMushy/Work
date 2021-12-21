public class ShiftSupervisorDemo {
    public static void main(String[] args) {
        ShiftSupervisor ss1 = new ShiftSupervisor("John Smith","123-A","11-15-2005",48_000,6_500);
        ShiftSupervisor ss2 = new ShiftSupervisor("Joan Jones","222-L","12-12-2005",55_000,8_500);

        System.out.println("Here's the first shift supervisor.\n"+ss1);
        System.out.println("Here's the second shift supervisor.\n"+ss2);

    }
}
