package chap07Poly;
//sender Ŭ������ ����� �� �̴�
public class SenderLogic {
	public void run(Sender obj) { //�θ�Ÿ���� ������ �Ű������� �����ϸ� 
								// �� �Ʒ� �ڽ� Ŭ������ ������ �����ϴ�
								//senderŬ������ Ŭ�������� Ȱ���ϴ� �޼ҵ�
		System.out.println("����Ϸ�");
		obj.print(); // print();�� �ڽĵ� �޼ҵ�
					// Parent�� ����Ȱ��� �� �ڽĵ鿡�� ����Ȱ� �ƴϴ�.
					// ������ Ÿ���� �ٸ���. 
					//�׷��� Sender ������ abstract ���� �����ϰ�
					//print();�� �־��־� �� �����.
	}
}
