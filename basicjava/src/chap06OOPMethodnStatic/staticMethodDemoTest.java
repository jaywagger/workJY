package chap06OOPMethodnStatic;

import java.util.Random;

public class staticMethodDemoTest {
	public static void main(String[] args) {
		//API�� static �޼ҵ� �����ϱ�
		//=> static����� �ν��Ͻ��Ǽ����� �ƴϹǷ� ������ Ŭ���������� �����Ѵ�.
		System.out.println(Math.PI); //static �޼ҵ��� ȣ��
		System.out.println(Math.random()); //�Ϲ� �޼ҵ�(�ν��Ͻ��޼ҵ�)�� ȣ��
		Random rand = new Random();
		System.out.println(rand.nextInt());
		
	}
}
