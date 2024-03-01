import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		int n = scanner.nextInt();
		
		int[] mang = new int[n];
		
		System.out.print("Nhap cac phan tu cua mang: ");
		for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu %d: ", i + 1);
            mang[i] = scanner.nextInt();
        }
		
		Arrays.sort(mang);
		System.out.print("Mang sau khi duoc sap xep: ");
		 for (int i = 0; i < n; i++) {
	            System.out.print(mang[i] + " ");
	     }
	     System.out.println();
	     
	     int min = mang[0];
	     for (int i = 1; i < n; i++) {
	         min = Math.min(min, mang[i]);
	     }
	     System.out.println("Min cua mang: " + min);
	     
	     int tong = 0;
	     int dem = 0;
	     for (int i = 0; i < n; i++) {
	         if (mang[i] % 3 == 0) {
	             tong += mang[i];
	             dem++;
	         }
	     }
	     if (dem > 0) {
	         double tb = (double) tong / dem;
	         System.out.println("Trung binh cong cac phan tu chia het cho 3: " + tb);
	     } else {
	         System.out.println("Khong co phan tu chia het cho 3");
	     }
	}

}
