import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num, total = 0;
		Scanner deger = new Scanner(System.in);

		do {
			System.out.print("lutfen sayi giriniz: ");
			num = deger.nextInt();
			if (num % 2 == 0 && num % 4 == 0) {
				total += num;
			}
		} while (num % 2 == 0);
		System.out.print("sayilarin toplami: "+total);
	}

}
