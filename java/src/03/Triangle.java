import java.io.*;

public class Triangle {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Please input length of triangle underline: ");
		String value1 = bufferedReader.readLine();
		int a = Integer.parseInt(value1);

		System.out.print("Please input height of triangle: ");
		String value2 = bufferedReader.readLine();
		int b = Integer.parseInt(value2);

		System.out.println("Area of triangle is: " + (double) a * b / 2);
	}
}
