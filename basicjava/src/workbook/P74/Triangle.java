package workbook.P74;

//워크북 74페이지 6번문제
//Triangle 클래스
public class Triangle extends Shape implements Resize {
	// 기본생성자
	public Triangle() {
	}

	// 생성자
	public Triangle(int width, int height, String colors) {
		super(width,height,colors);
	}

	@Override
	public double getArea() {
		/*double area = 0.0;
		area = getWidth()*getHeight()/2;
		return area;*/
		return getWidth()*getHeight()/2;
	}

	@Override
	public void setResize(int size) {
		setHeight(getHeight()+size);
	}

}
