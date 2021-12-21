import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    throws IOException
    {
        FileReader reader = new FileReader("secret.txt");
        BufferedReader br = new BufferedReader(reader);
        

        String line = br.readLine();

        while(line != null)
        {
            String[] token = line.split(" ");

            StringBuilder s = new StringBuilder();
            for (int i = 0; i < token.length; i = i + 5){
                s.append(Character.toUpperCase(token[i].charAt(0)));}

            System.out.println(s);

            line = br.readLine();

        }

        br.close();
        reader.close();

    }
    
}
