package chap02variable;
//�������� ��������� �ٲٱ�
public class Constant_Ex1 {

	public static void main(String[] args) 
	{
		int x = 10; //final�� ������ constant value�� �Ǿ� �������� �ٲ� �� ����.
		int y = 20; //������� �빮�ڸ� ����ϴ°� ���. �����ܾ�� '_'�� ���.
		int tmp = 0;
		System.out.println("������ Ȱ���Ͽ� �ʱ�ȭ���� �ٲ� �� �ִ�.");	
		System.out.println("X:"+ x + " Y:" + y);
			
		tmp = x; //tmp->x, x->y, y->tmp
		x = y;
		y = tmp;
		
		System.out.println("X:"+ x + " Y:" + y);
		System.out.println();
		
		final int X = 10; // final+ int/string + �빮�� = �����. 
		final int Y = 20; // Constant value
		System.out.println("������� ������ �ʴ´�.");	
		System.out.println("X:"+ X + " Y:" + Y);
/*		int tmp1 =0;
		tmp1 = X; //tmp->x, x->y, y->tmp
		X = Y; // ������ ���. �� ������ ������� ���� �� ���� �����̴�.
		Y = tmp;
*/
		
		
		
		

	}

}
