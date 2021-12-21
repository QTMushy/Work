import java.util.Scanner;

public class SavingAccountDemo {
    public static void main(String[] args) {

        double balance;
        double annual_interest;
        double deposit;
        double withdraw;
        int months;
        double total_deposit = 0;
        double total_withdrawn = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Starting Balance:\r");
        balance = keyboard.nextDouble();
        System.out.println("Enter Annual interest:");
        annual_interest = keyboard.nextDouble();
        System.out.println("Number of months:");
        months = keyboard.nextInt();
        SavingAccount account = new SavingAccount(balance,annual_interest);
        for(int i =1;i<=months;i++)
        {

            System.out.println("Enter the amount deposited for "+i+" month");
            deposit = keyboard.nextDouble();
            System.out.println("Enter the amount withdrawn for "+i+" month");
            withdraw = keyboard.nextDouble();
            account.deposit(deposit);
            account.withdraw(withdraw);
            account.monthly_interest();
            total_deposit+=deposit;
            total_withdrawn+=withdraw;


        }
        System.out.printf("Total deposited:%,.2f\n",total_deposit);
        System.out.printf("Total withdrawn:%,.2f\n",total_withdrawn);
        System.out.printf("Total Interest Earned:%,.2f\n",account.gettInterest());
        System.out.printf("Ending Balance:%,.2f\n",account.getBalance());


    }
}