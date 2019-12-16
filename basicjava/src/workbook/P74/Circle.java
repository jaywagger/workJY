package workbook.P74;

//circle만들기 
public class Circle extends Shape implements Resize {
	private int radius;

	// 기본생성자
	public Circle() {
	}

	// 생성자
	public Circle(int width, int height, String colors, int radius) {
		super(width, height, colors);
		this.radius = radius;
	}

	// Getter&Setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void setResize(int size) {
		setRadius(getRadius() + size);
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
