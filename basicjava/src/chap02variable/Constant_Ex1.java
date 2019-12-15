package chap02variable;
//변수값을 상숙값으로 바꾸기
public class Constant_Ex1 {

	public static void main(String[] args) 
	{
		int x = 10; //final를 붙히면 constant value가 되어 변수값을 바꿀 수 없다.
		int y = 20; //상수값은 대문자를 사용하는게 약속. 여러단어면 '_'를 사용.
		int tmp = 0;
		System.out.println("변수를 활용하여 초기화값을 바꿀 수 있다.");	
		System.out.println("X:"+ x + " Y:" + y);
			
		tmp = x; //tmp->x, x->y, y->tmp
		x = y;
		y = tmp;
		
		System.out.println("X:"+ x + " Y:" + y);
		System.out.println();
		
		final int X = 10; // final+ int/string + 대문자 = 상수값. 
		final int Y = 20; // Constant value
		System.out.println("상수값은 변하지 않는다.");	
		System.out.println("X:"+ X + " Y:" + Y);
/*		int tmp1 =0;
		tmp1 = X; //tmp->x, x->y, y->tmp
		X = Y; // 에러가 뜬다. 그 이유는 상수값은 변할 수 없기 때문이다.
		Y = tmp;
*/
		
		
		
		

	}

}
