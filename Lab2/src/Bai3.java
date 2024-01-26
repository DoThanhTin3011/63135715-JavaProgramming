import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("Nhập số điện: ");
		double sodien = scanner.nextDouble();
		System.out.print("Nhập số tháng: ");
		double thang =scanner.nextDouble();
		if(thang<50)
			System.out.printf("Tiền điện tháng %.1f",sodien*1000);
		else
			System.out.printf("Tiền điện tháng %.1f",50*1000+(sodien-50)*1200);
	}

}
