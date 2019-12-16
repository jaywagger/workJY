package workbook.P74;
//��ũ�� 74������ 6������
//Rectangle
public class Rectangle extends Shape implements Resize {
	// �⺻������
	public Rectangle() {
	}

	// ������
	public Rectangle(int width, int height, String colors) {
		super(width,height,colors);
	}

	@Override
	public double getArea() {
		return getWidth()*getHeight();
	}

	@Override
	public void setResize(int size) {
		setWidth(getWidth()+size);
	}
}
