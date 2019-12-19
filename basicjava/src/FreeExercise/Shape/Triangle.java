package FreeExercise.Shape;
//况农合 74其捞瘤 6锅 巩力
public class Triangle extends Shape implements Resize{
	//扁夯积己磊
	public Triangle() {
	}//积己磊
	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
	}
	@Override
	public void setResize(int size) {
		setHeight(getHeight()+ size);
	}
	@Override
	public double getArea() {
		double area = 0.0;
		area = (double)(getWidth()*getHeight())/2;
		return area;
	}
	
}
