import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập cạnh khối lập phương: ");
		double canh = scanner.nextDouble();
		double theTich = Math.pow(canh, 3);
		System.out.printf("Thể tích khối lập phương: %.1f", theTich);
	}

}
