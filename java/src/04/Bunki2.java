import java.io.*;

public class Bunki2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please input value: ");
		String value1 = bufferedReader.readLine();
		int a = Integer.parseInt(value1);

		if (a == 1) {
			System.out.println("You input is 1");
		} else {
			System.out.println("You input isn't 1");
		}
	}
}

