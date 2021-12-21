import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class filewords {

	public static void main(String[] args) throws Exception 
	
	{

		FileReader file = new FileReader("input.txt");
		Scanner read = new Scanner(file);

		Map<Character,HashSet<String>> list = new HashMap<>();

		while(read.hasNext())
		{
			String word = read.next();
			word = word.toLowerCase();

			if(list.containsKey(word.charAt(0)))
			{
				list.get(word.charAt(0)).add(word);
			}
			else
			{
				list.put(word.charAt(0), new HashSet<>());
				list.get(word.charAt(0)).add(word);
			}
		}

		read.close();
		file.close();


		System.out.println(Collections.singletonList(list));
		
	}
	
}
