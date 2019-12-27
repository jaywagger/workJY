package chap07Poly.Sender;
public class EmailSender extends Sender {
	int length;
	
	public EmailSender(String name,int length){
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
		System.out.println(name+"("+length+")�� �����߽��ϴ�.");
	}
}
