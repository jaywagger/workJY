package chap08Exception;
/*API �޼ҵ带 ȣ���ϴ� ���
 1. API�� �޼ҵ带 ����� �� ����ο� throws�� �߰��Ǿ� �ִ¸� �ݵ��
 try~catch�� ó���ؾ� �Ѵ�.
 2. �޼ҵ尡 RuntimeException��  ���� Exception�� throws �ϴ� ��쿡��
 	���������� Exception�� ���� ó���� �ϵ��� �������� �ʴ´�.
 	=> ���������� �������� ������ Exception�� throws�ϰ� ������ ó�� �ؾ��Ѵ�.
 
 *
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//API�� �޼ҵ带 ȣ���ϴ� ���
public class ExceptionTest05 {
	public static void main(String[] args) {
		//FileInputStream fs = new FileInputStream("test.txt"); 
		//������ �ҷ��ͼ� �غ��ϴ� Ŭ����. �R� ���� �۾�
		//������ JVM�� �ƴ� OS �Ҽ�.
		//�츰 ���Ͽ� ���������� �о���� �ϴ� ����
	/*	public FileInputStream(File file)
				throws FileNotFoundException
		
		FileInputStream������ ������ ���� ���� �ڵ��̴�. �׷��� ����ó���� ó���ϰ� �����ؾ� �Ѵ�.
				*/
		try {
			FileInputStream fs = new FileInputStream("test.txt"); //����ó��
			System.out.println(fs.read()); //�̰͵� ����ó��
			System.out.println(Integer.parseInt("1234"));
			System.out.println(Integer.parseInt("���ڿ�"));//����okay but 
		}/*catch(NumberFormatException e) {
			System.out.println("������.");// parseInt ����ó��
		}*/
		catch(FileNotFoundException e){ //�� ������ IOE���� ������ �;���
			System.out.println("������ ã�� �� �����ϴ�.");
			//������ �ٽ� ������ �� �ֵ��� ó��
		}catch(IOException e) {
			System.out.println("������ ���� �� ������ �߻��߽��ϴ�.");
		}
	
	}

}
