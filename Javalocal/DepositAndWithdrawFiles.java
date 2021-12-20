import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DepositAndWithdrawFiles {

    public static void main(String[] args)
            throws IOException
    {
        ArrayList<Double> deposit = new ArrayList<>();
        ArrayList<Double> withdraw = new ArrayList<>();
        String line;
        FileReader filereader = new FileReader("D:\\Java Masterclass\\Assignment\\src\\com\\company\\Withdrawals.txt");
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
        FileReader fr = new FileReader("D:\\Java Masterclass\\Assignment\\src\\com\\company\\Deposits.txt");
        BufferedReader br2 = new BufferedReader(fr);
        line = br2.readLine();
        while(line!=null)
        {
            double temp = Double.parseDouble(line);
            deposit.add(temp);
            line = br.readLine();
        }
        fr.close();
        br2.close();
    }
}

