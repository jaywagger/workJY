package workbook.P74;
//워크북 74페이지 6번문제

//상위클래스: 추상화
public abstract class Shape {
	private int width;
	private int height;
	private String colors;

	// 기본생성자
	public Shape() {
	}
	// 생성자
	public Shape(int width, int height, String colors) {
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	// getArea메서드
	public abstract double getArea();

	// Getter & Setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}
}




