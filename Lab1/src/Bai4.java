import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập c: ");
		double c = scanner.nextDouble();
		double Delta = Math.pow(b,2)-4*a*c;
		System.out.printf("Delta: %.1f", Delta);
	}

}
