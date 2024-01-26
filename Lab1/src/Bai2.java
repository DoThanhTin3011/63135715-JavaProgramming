import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập chiều dài hình CN: ");
		double chieuDai = scanner.nextDouble();
		System.out.print("Nhập chiều rộng hình CN: ");
		double chieuRong = scanner.nextDouble();
		double chuVi=(chieuDai + chieuRong)*2;
		double dienTich=chieuDai*chieuRong;
		double CanhNN = Math.min(chieuDai,chieuRong);
		System.out.printf("Chu vi: %.1f", chuVi);
		System.out.printf("Diện tích: %.1f", dienTich);
		System.out.printf("Cạnh nhỏ nhất: %.1f", CanhNN);
	}

}
