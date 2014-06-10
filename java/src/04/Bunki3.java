import java.io.*;

public class Bunki3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please input value: ");
		String value1 = bufferedReader.readLine();
		int a = Integer.parseInt(value1);

		if (a == 1) {
			System.out.println("You input is 1");
		} else if (a == 2) {
			System.out.println("You input is 2");
		} else if (a == 3) {
			System.out.println("You input is 3");
		} else {
			System.out.println("You input isn't 1");
		}
	}
}

