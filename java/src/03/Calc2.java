import java.io.*;

public class Calc2 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please input first value: ");
		String value1 = bufferedReader.readLine();
		int a = Integer.parseInt(value1);

		System.out.print("Please input second value: ");
		String value2 = bufferedReader.readLine();
		int b = Integer.parseInt(value2);

		int answer = a / b;

		System.out.println(a + " / " + b + " = " + answer);
	}
}
