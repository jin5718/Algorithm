import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int b = sc.nextInt();

		for (int j = 0; j < arr.length; j++) {
			if (b == arr[j]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
