import java.io.*;

public class Bunki {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please input value: ");
		String value1 = bufferedReader.readLine();
		int a = Integer.parseInt(value1);

		if (a == 1) {
			System.out.println("You input 1");
		}
	}
}

