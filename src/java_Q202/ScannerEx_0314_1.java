package java_Q202;

import java.util.Scanner;

public class ScannerEx_0314_1 {

	public static void main(String[] args) {
		// 3�� 14�� ù �ڵ� ��� ����
		
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // ���ڿ� �б�
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next(); // ���ڿ� �б�
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt(); // ���� �б�
		System.out.print("���̴� " + age + ", ");
		
		double weight = scanner.nextDouble(); // �Ǽ� �б�
		System.out.print("ü���� " + weight + ", ");
		
		boolean single = scanner.nextBoolean(); // ���� �б�
		System.out.print("���� ���δ� " + single + "�Դϴ�.");
		
		scanner.close();

	}

}
