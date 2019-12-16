package JY;

import workbook.P74.Rectangle;

//워크북 74페이지 6번 문제
public class ShapeTest {
	public static void main(String[] args) {
		Shape shape[] = new Shape[6];
		shape[0] = new Triangle(7, 5, "Blue");
		shape[1] = new Rectangle(4, 6, "Blue");
		shape[2] = new Triangle(6, 7, "Red");
		shape[3] = new Rectangle(8, 3, "Red");
		shape[4] = new Triangle(9, 8, "White");
		shape[5] = new Rectangle(5, 7, "White");
		// 배열 초기화
		System.out.println("기본정보" + "\t" + "\t면적" + "\t" + "색상");
		System.out.println("-----------------------------------------");
		String name = "";
		for (int i = 0; i < shape.length; i++) {
			if (shape[i] instanceof Triangle) {
				name = "Triangle";
			} else if (shape[i] instanceof Rectangle) {
				name = "Rectangle";
			}
			{
				System.out.println(name + "\t" + shape[i].getArea() + "\t" + shape[i].getColors());
			}
		}//사이즈 변경 후 정보
		System.out.println("-----------------------------------------");
		System.out.println("사이즈 변경 후 정보");
		for (int i = 0; i < shape.length; i++) {
			if (shape[i] instanceof Triangle) {
				((Triangle) shape[i]).setResize(5);
				name = "Triangle";
			} else ((Rectangle) shape[i]).setResize(5);
				name = "Rectangle";
			
			{
				System.out.println(name + "\t" + shape[i].getArea() + "\t" + shape[i].getColors());
			}
		}
	}
}
