package THjava1;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhap so thu hai: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
     
        System.out.println("Tong: " + sum);
        System.out.println("Hieu: " + difference);
    }

}
