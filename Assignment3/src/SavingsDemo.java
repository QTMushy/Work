public class SavingsDemo {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(100,.25);

        s1.withdraw(90);
        s1.withdraw(5);
        s1.deposit(200);
        s1.withdraw(100);
        s1.monthlyProcess();

        System.out.println(s1);
    }
}
