package konkuk.sw;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num == 0) {
			System.out.println("2�ܿ��� 9�ܱ��� ����մϴ�.");
			for(int j=2;j<=9;j++)
			for (int i = 1; i <= 9; i++) {
				System.out.println(j + " * " + i + " = " + j * i);
			}
		} else {
			System.out.println(num + "���� ����մϴ�.");
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		}
	}
}
