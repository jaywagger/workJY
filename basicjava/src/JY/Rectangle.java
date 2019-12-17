package JY;
//况农合 74其捞瘤 6锅 巩力
public class Rectangle extends Shape implements Resize{
	//扁夯积己磊
	public Rectangle() {
	}//积己磊
	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	@Override
	public void setResize(int size) {
		setWidth(getWidth()+ size);
	}
	@Override
	public double getArea() {
		double area = 0.0;
		area = (double)(getWidth()*getHeight());
		return area;
	}

}
