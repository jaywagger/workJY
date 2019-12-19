package FreeExercise.Shape;
//워크북 74페이지 6번 문제
public abstract class Shape {
	private int width;
	private int height;
	private String colors;
	//기본생성자
	public Shape() {
	}//기본생성자
	public Shape(int width, int height, String colors) {
		this.width = width;
		this.height = height;
		this.colors = colors;
	}//넓이구하기
	public abstract double getArea();
	public int getWidth() {
		return width;
	}
	//Getter&Setter
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
	
