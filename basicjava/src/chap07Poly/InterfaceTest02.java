package chap07Poly;

import javax.swing.JFrame;
//�������̽��� ����ϴ� ������ ���߻�� ��� �� ����.
//						�⺻������ �����ؾ� �ϴ� ����� �������� �����ϴ� ����

//GUI�� ��Ŭ�������� ���α׷��� ����� ���
class GUITest extends JFrame implements Runnable{
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					//���ǵ� �����. ����ϱ� final static�� �ٴ´�.
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}


public class InterfaceTest02 {
	public static void main(String[] args) {
		GUITest obj = new GUITest("�������̽� ����");//�ߴ� �˾��� JFrame
	}

}
