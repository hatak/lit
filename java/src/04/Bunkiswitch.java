import java.io.*;

public class Bunkiswitch {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please input value: ");
		String value1 = bufferedReader.readLine();
		int a = Integer.parseInt(value1);

		switch (a) {
			case 1:
				System.out.println("You input is 1");
				break;
			case 2:
				System.out.println("You input is 2");
				break;
			case 3:
				System.out.println("You input is 3");
				break;
			default:
				System.out.println("You input isn't 1");
		}
	}
}

