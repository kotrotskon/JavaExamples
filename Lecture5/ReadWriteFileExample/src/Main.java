import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			String text = "";
			BufferedReader in = new BufferedReader(new FileReader("data/in.txt"));
			FileWriter out = new FileWriter("data/out.txt");
			String line;
			while((line = in.readLine()) != null)
			{
			    System.out.println(line);
			    text = text + line;
			}
			text = text.toUpperCase();
			in.close();
			System.out.println(text);
			out.write(text);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
