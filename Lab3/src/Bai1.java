import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Nhap 1 so nguyen: ");
		int N = scanner.nextInt();
		
		boolean ok = true;
		for(int i=2; i < N-1; i++){
			if(N % i == 0){
			ok = false;
			break;
			}
			i++;
		}
		
		if (ok) {
			System.out.println(N + " la so nguyen to");
		}else {
			System.out.println(N + " khong phai la so nguyen to");
		}
	}

}
