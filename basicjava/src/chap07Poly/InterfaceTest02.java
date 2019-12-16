package chap07Poly;

import javax.swing.JFrame;
//인터페이스를 사용하는 목적은 다중상속 허용 및 적용.
//						기본적으로 구현해야 하는 기능이 무엇인지 정의하는 목적

//GUI가 이클립스같은 프로그램을 만드는 경우
class GUITest extends JFrame implements Runnable{
	GUITest(String title){
		super(title);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					//정의된 상수다. 상수니깐 final static이 붙는다.
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}


public class InterfaceTest02 {
	public static void main(String[] args) {
		GUITest obj = new GUITest("인터페이스 연습");//뜨는 팝업이 JFrame
	}

}
