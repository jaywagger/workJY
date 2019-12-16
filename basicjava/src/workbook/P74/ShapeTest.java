package workbook.P74;
//��ũ�� 74������ 6������
public class ShapeTest {
	public static void main(String[] args) {
		//ShapeŸ���� ��ü�� ������ �� �ִ� ���� 6���� �迭�� ����
		Shape[] shape  = new Shape[7];
		//���� �� �׸�. �ʱ�ȭ�۾� �ʿ���.
		shape [0] =  new Triangle(7,5,"Blue");
		shape [1] =  new Rectangle(4,6,"Blue");
		shape [2] =  new Triangle(6,7,"Red");
		shape [3] =  new Rectangle(8,3,"Red");
		shape [4] =  new Triangle(9,8,"White");
		shape [5] =  new Rectangle(5,7,"White");
		shape [6] =  new Circle(0,0,"White",5);
		System.out.println("�⺻����");
		for (int i=0; i< shape.length; i++) {
			/*System.out.println(shape[i].getClass().getName()+
					"\t"+shape[i].getArea()+"\t"
					+shape[i].getColors());*/
			//�迭�� ����� ��ü�� Ÿ���� �˻��մϴ�.
			String name = "";
			if(shape[i] instanceof Rectangle){
				name = "Rectangle";
			} else if (shape[i] instanceof Triangle){ 
				name = "Triangle";
				
			}else {
				name = "Circle";
			}
			System.out.println(name+"\t"+shape[i].getArea()+
					"\t"+shape[i].getColors());
		}
		System.out.println("======================");
		System.out.println("����� ���� �� ����");
		//������ for�� - 5.0���� �߰��� for��
		//�迭�̳� Collection�� �ٸ� �� ���
		//for���� �� �� ����ɶ�����
		//shape�迭���� ��� �ϳ��� ������ obj�� ���� �� �۾�
		String name = "";
		for(Shape obj: shape) {
			//��ü�� Ÿ���� �����ϴ� ��� ������ �����ϴ� ���� �ƴ϶�
			//��ü�� Ÿ���� üũ�� �Ŀ� �����Ѵ�.
			if(obj instanceof Rectangle) {
				((Rectangle) obj).setResize(5);
				name = "Reactangle";
			}else if (obj instanceof Triangle) {
				((Triangle) obj).setResize(5);
				name = "Triangle";
			}else {
				((Circle) obj).setResize(5);
				name = "Circle";
			}
			System.out.println(name+"\t"+obj.getArea()+"\t"
			+obj.getColors());//obj = shape[i}
		}
		
	}

}
