package chap08Exception;
//��������� Exception �����. Exception(String message)Ȱ�� ����
// ���� 439������
public class MyException extends Exception{
	public MyException(String msg) { //���ڿ��� �Ű������� �޴� ������
		super(msg);//������ Exception Ŭ������ �����ڸ� ȣ���Ѵ�.
	}
	//MyException�� �߻����� �� �����ϰ� ���� ������ �ְų� ó���ؾ� �� ������ �ִ� ���
	//�̰ɷ� ����
}
//���� ���� ������ JVM�� ������ �� �ֵ��� ���������� ������ ����� �۾��� �ؾ���.
// ��ɾ� throw��. throw's'���� �ٸ�
//���ܸ� ���������� �߻���ų �� throw ��ɾ �����.
