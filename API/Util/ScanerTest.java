package API.Util;

import java.util.Scanner;

//Scanner Ŭ���� (API)�� �����
//=>���α׷� ���� �߰��� ���� �Է¹��� �� �̾� ��ɵ��� �����ϴ� Ŭ����
public class ScanerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ��������~!");
		String data = key.next();
		//��ĳ���� next �żҵ� ���
		System.out.println("Ű����� �Է¹��� ���ڿ�:"+data);
		//next�� �����̽��� ������ ���ڸ� ����.
		//ln�� ���� ��
		System.out.print("���ڸ� �Է��ϼ���");
		int num = key.nextInt();
		//��ĳ���� next int �żҵ� ���
		System.out.println("Ű����� �Է¹��� ���ڿ�:"+num);
	}

}
