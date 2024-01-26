import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("+---------------------------------------------------+");
            System.out.println("1. Giải phương trình bậc nhất");
            System.out.println("2. Giải phương trình bậc 2");
            System.out.println("3. Tính tiền điện");
            System.out.println("4. Kết thúc");
            System.out.println("+---------------------------------------------------+");
            System.out.print("Chọn chức năng: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình.\n");
                    break;
                default:
                    System.out.println("Không hợp lệ. Vui lòng chọn lại!!!.\n");
                    break;
            }
        } while (choice != 4);

        scanner.close();
	}
	public static void giaiPTB1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b= scanner.nextDouble();
		if(a==0) {
			if(b==0)
				System.out.println("PT vô số nghiệm\n");
			else 
				System.out.println("PT vô nghiệm\n");
		}else 
			System.out.printf("PT có nghiêm x = %f\n",-b/a);
			
	}
    public static void giaiPTB2() {
    	Scanner scanner =new Scanner(System.in);
		System.out.print("Nhập a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhập b: ");
		double b = scanner.nextDouble();
		System.out.print("Nhập c: ");
		double c = scanner.nextDouble();
		double delta=Math.pow(b,2)-4*a*c;
		if(a==0) {
			System.out.printf("PT có nghiêm x = %f\n",-c/b);
		}else {
			if(delta<0)
				System.out.println("PT vô nghiệm\n");
			if(delta==0)
				System.out.printf("PT có nghiệm kép x = %f\n",-b/(2*a));
			else {
				System.out.printf("PT có 2 nghiệm x1 = %f\n",(-b+Math.sqrt(delta))/(2*a));
				System.out.printf("PT có 2 nghiệm x2 = %f\n",(-b-Math.sqrt(delta))/(2*a));
			}
		}
	}

    public static void tinhTienDien() {
    	Scanner scanner =new Scanner(System.in);
		System.out.print("Nhập số điện: ");
		double sodien = scanner.nextDouble();
		System.out.print("Nhập số tháng: ");
		double thang =scanner.nextDouble();
		if(thang<50)
			System.out.printf("Tiền điện tháng %.1f\n",sodien*1000);
		else
			System.out.printf("Tiền điện tháng %.1f\n",50*1000+(sodien-50)*1200);
	}

}
