package chap07Poly.Sender;
//���߿� �߰������� �ٸ� ������ ������ �ʿ䰡 ����.
//�� ������. �� ������
// ���������� ��ӹ޾ұ� ����. 
public class MSSSender extends Sender {
	int length;
	public MSSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void print() {
		//SMS Sender�� ���� ����� ����
		System.out.println(length+"��"+name+"���ۿϷ�");
	}
	
}
