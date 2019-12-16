package workbook.P74;
//况农合 74其捞瘤 6锅巩力
//Rectangle
public class Rectangle extends Shape implements Resize {
	// 扁夯积己磊
	public Rectangle() {
	}

	// 积己磊
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
