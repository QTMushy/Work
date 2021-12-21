import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class DepositAndWithdrawFiles {

    public static void main(String[] args)
            throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Annual interest:");
        double interest = keyboard.nextDouble();
        SavingAccount account = new SavingAccount(500,interest);
        ArrayList<Double> deposit = new ArrayList<>();
        ArrayList<Double> withdraw = new ArrayList<>();
        String line;
        FileReader filereader = new FileReader("Withdrawals.txt");
        BufferedReader br = new BufferedReader(filereader);
        line = br.readLine();
        while(line!=null)
        {
            double temp = Double.parseDouble(line);
            withdraw.add(temp);
            line = br.readLine();
        }
        filereader.close();
        br.close();
        FileReader fr = new FileReader("Deposits.txt");
        BufferedReader br2 = new BufferedReader(fr);
        line = br2.readLine();
        while(line!=null)
        {
            double temp = Double.parseDouble(line);
            deposit.add(temp);
            line = br2.readLine();
        }
        fr.close();
        br2.close();

        for(int i =0 ; i<deposit.size();i++)
        {
            account.deposit(deposit.get(i));
        }
        for (int i=0; i< withdraw.size();i++)
        {
            account.withdraw(withdraw.get(i));
        }
        account.monthly_interest();
        System.out.printf("Interest Earned:%,.2f\n",account.gettInterest());
        System.out.printf("Ending Balance:%,.2f\n",account.getBalance());

    }
}

