import java.io.*;

public class Name {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please input your name: ");
		String name = bufferedReader.readLine();
		System.out.println("Your name is " + name);
	}
}
