import java.io.*;

public class Calc3 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please input first value: ");
		String value1 = bufferedReader.readLine();
		double a = Double.parseDouble(value1);

		System.out.print("Please input second value: ");
		String value2 = bufferedReader.readLine();
		double b = Double.parseDouble(value2);

		double answer = a / b;

		System.out.println(a + " / " + b + " = " + answer);
	}
}
